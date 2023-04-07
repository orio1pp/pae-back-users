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
        questionaryRepository.save(new Questionary(questionaryDTO.getName(),questions));
    }

    public List<Question> getQuestions(Long id) {
        Optional<Questionary> questionary = questionaryRepository.findById(id);
        if(questionary.isPresent()){
            return questionary.get().getQuestions();
        }
        return null;
    }
}
