package com.example.demo.service;

import com.example.demo.model.Questionary;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public QuestionService(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    public void setMultipleQuestions(List<Questionary> questionaries) {
        for (Questionary questionary : questionaries) {
            questionRepository.save(questionary);
            //for (Options ans : questionary.getOptions()) answerRepository.save(ans);
        }
    }

    public List<Questionary> getAllQuestions() {
        return (List<Questionary>) questionRepository.findAll();
    }
}
