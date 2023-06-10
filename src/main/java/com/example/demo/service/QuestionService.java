package com.example.demo.service;

import com.example.demo.DTOs.OptionsDTO;
import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.model.Options;
import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class  QuestionService {

    private final QuestionRepository questionRepository;
    private final OptionsService optionsService;

    public QuestionService(QuestionRepository questionRepository, OptionsService optionsService) {
        this.questionRepository = questionRepository;
        this.optionsService = optionsService;
    }

    private List<Options> insertOptions(List<OptionsDTO> options, String type){
        if(type != null && !type.isEmpty())
            return optionsService.insertOptions(options, type);
        return new ArrayList<Options>();
    }

    private Question createQuestion(QuestionDTO question){
        List<Options> options = insertOptions(question.getOptionsList(), question.getType());
        return new Question(question.getQuestionText(), options, question.getType(), question.getPage(),
                question.getQuestionInformation(), question.getTraduccion(), question.getCompulsory(), question.getAnswerRelateds());
    }
    public List<Question> insertOptionsAndGetQuestions(List<QuestionDTO> questionDTOList){
        List<Question> questions = new ArrayList<>();
        int previousPage = 0;
        for (QuestionDTO questionDTO : questionDTOList){
            if(questionDTO.getPage() == previousPage+1 || questionDTO.getPage() == previousPage) {
                previousPage = questionDTO.getPage();
                Question question = createQuestion(questionDTO);
                questions.add(question);
            }
            else
                return null;
        }
        return questions;
    }

    public void insertQuestion(QuestionDTO questionDTO) {
        Question question = createQuestion(questionDTO);
        questionRepository.save(question);
    }

    public Question getQuestionById(long questionId) {
        Optional<Question> question = questionRepository.findById(questionId);
        return question.get();
    }
}
