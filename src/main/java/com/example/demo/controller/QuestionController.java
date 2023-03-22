package com.example.demo.controller;

import com.example.demo.model.Questionary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.QuestionService;

import java.util.List;

@RestController
@CrossOrigin
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("questions")
    public ResponseEntity<Questionary> setMultipleQuestions(@RequestBody List<Questionary> questionaries) {
        if (questionaries != null) {
            questionService.setMultipleQuestions(questionaries);
        }
        return ResponseEntity.ok(questionaries.get(0));
    }

    @GetMapping("questions")
    public ResponseEntity<List<Questionary>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("test")
    public String RetornString() { return "hola"; }
}
