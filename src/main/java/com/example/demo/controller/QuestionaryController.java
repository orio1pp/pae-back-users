package com.example.demo.controller;

import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.DTOs.QuestionaryDTO;
import com.example.demo.model.Question;
import com.example.demo.model.Questionary;
import com.example.demo.service.QuestionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class QuestionaryController {
    private final QuestionaryService questionaryService;

    public QuestionaryController(QuestionaryService questionaryService) {
        this.questionaryService = questionaryService;
    }

    @PostMapping("Questionary")
    public void insertQuestionary(@RequestBody QuestionaryDTO questionaryDTO){
        questionaryService.insertQuestionary(questionaryDTO);
    }

    @GetMapping("GetQuestionary")
    public List<Question> getQuestionary(@RequestParam String name){
        return questionaryService.getQuestions(name);
    }

}
