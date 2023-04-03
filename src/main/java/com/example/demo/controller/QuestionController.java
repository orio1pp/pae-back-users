package com.example.demo.controller;

import com.example.demo.DTOs.QuestionDTO;
import com.example.demo.service.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("Question/checkbox")
    public void insertQuestion(@RequestBody QuestionDTO question){
        questionService.insertQuestion(question);
    }
}
