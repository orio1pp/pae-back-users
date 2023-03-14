package com.example.demo.controller;

import com.example.demo.model.Question;
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
    public ResponseEntity<Question> setMultipleQuestions(@RequestBody List<Question> questions) {
        if (questions != null) {
            questionService.setMultipleQuestions(questions);
        }
        return ResponseEntity.ok(questions.get(0));
    }

    @GetMapping("questions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("test")
    public String RetornString() { return "hola"; }
}
