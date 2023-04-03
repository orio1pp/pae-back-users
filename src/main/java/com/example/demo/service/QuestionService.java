package com.example.demo.service;

import com.example.demo.DTOs.OptionsDTO;
import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.model.Options;
import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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
        return new Question(question.getQuestionText(), options, question.getType());
    }
    public List<Question> insertOptionsAndGetQuestions(List<QuestionDTO> questionDTOList){
        List<Question> questions = new ArrayList<>();
        for (QuestionDTO questionDTO : questionDTOList){
            Question question = createQuestion(questionDTO);
            questions.add(question);
        }
        return questions;
    }

    public void insertQuestion(QuestionDTO questionDTO) {
        Question question = createQuestion(questionDTO);
        questionRepository.save(question);
    }
}
