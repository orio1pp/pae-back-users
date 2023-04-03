package com.example.demo.service;

import com.example.demo.DTOs.QuestionDTO;
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


    public void insertQuestionary(List<QuestionDTO> questionDTOList){
        List<Question> questions = questionService.insertOptionsAndGetQuestions(questionDTOList);
        questionaryRepository.save(new Questionary(questions));
    }
}
