package com.example.demo.controller;

import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.model.Questionary;
import com.example.demo.service.QuestionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionaryController {
    private final QuestionaryService questionaryService;

    public QuestionaryController(QuestionaryService questionaryService) {
        this.questionaryService = questionaryService;
    }

    @PostMapping("Questionary")
    public void insertQuestionary(@RequestBody List<QuestionDTO> questionDTOList){
        questionaryService.insertQuestionary(questionDTOList);
    }

}
