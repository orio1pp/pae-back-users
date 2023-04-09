package com.example.demo.service;

import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.DTOs.QuestionaryDTO;
import com.example.demo.model.Question;
import com.example.demo.model.Questionary;
import com.example.demo.repository.QuestionaryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionaryService {
    private final QuestionaryRepository questionaryRepository;
    private final QuestionService questionService;

    public QuestionaryService(QuestionaryRepository questionaryRepository, QuestionService questionService) {
        this.questionaryRepository = questionaryRepository;
        this.questionService = questionService;
    }


    public void insertQuestionary(QuestionaryDTO questionaryDTO){
        List<Question> questions = questionService.insertOptionsAndGetQuestions(questionaryDTO.getQuestions());
        if(questions != null) {
            questionaryRepository.save(new Questionary(questionaryDTO.getName(), questions));
        }
    }

    public List<List<Question>> getQuestions(String name) {
        Optional<Questionary> questionary = questionaryRepository.findByName(name);
        if(questionary.isPresent()){
            List<Question> questions =  questionary.get().getQuestions();
            return getQuestionsByPage(questions);
        }
        return null;
    }

    private List<List<Question>> getQuestionsByPage(List<Question> questions){
        List<List<Question>> questionsByPage = new ArrayList<>();
        int previousPage = 0;
        List<Question> questionsInPage = new ArrayList<>();
        for (Question question : questions){
            if(question.getPage() != previousPage) {
                questionsByPage.add(questionsInPage);
                questionsInPage = new ArrayList<>();
                previousPage = question.getPage();
            }
            questionsInPage.add(question);

        }
        if(questionsInPage.size()>0)
            questionsByPage.add(questionsInPage);
        return questionsByPage;
    }
}
