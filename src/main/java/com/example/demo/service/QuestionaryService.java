package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.Questionary;
import com.example.demo.repository.QuestionaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionaryService {
    private final QuestionaryRepository questionaryRepository;
    private final QuestionService questionService;

    public QuestionaryService(QuestionaryRepository questionaryRepository, QuestionService questionService) {
        this.questionaryRepository = questionaryRepository;
        this.questionService = questionService;
    }


    public void insertQuestionary(Questionary questionary){
        /*
        List<Question> questions = questionary.getQuestions();
        for(Question question : questions){
            questionService.insertQuestion(question);
        }
         */
        questionaryRepository.save(questionary);
    }
}
