package com.example.demo.service;

import com.example.demo.Model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void setMultipleQuestions(List<Question> questions) {
        for (Question question : questions){
            questionRepository.save(question);
        }
    }
}
