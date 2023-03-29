package com.example.demo.controller;

import com.example.demo.model.Questionary;
import com.example.demo.service.QuestionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionaryController {
    private final QuestionaryService questionaryService;

    public QuestionaryController(QuestionaryService questionaryService) {
        this.questionaryService = questionaryService;
    }

    @PostMapping("Questionary")
    public void insertQuestionary(@RequestBody Questionary questionary){
        questionaryService.insertQuestionary(questionary);
    }

}
