package com.example.demo.controller;

import com.example.demo.model.Answer;
import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("answer")
    public void insertAnswerToAQuestionary(@RequestBody List<Answer> answers){
        answerService.answerQuestionary(answers);
    }
}
