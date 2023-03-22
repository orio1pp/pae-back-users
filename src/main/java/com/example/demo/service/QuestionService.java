package com.example.demo.service;

import com.example.demo.model.Questionary;
import com.example.demo.repository.OptionsRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final OptionsRepository optionsRepository;
    public QuestionService(QuestionRepository questionRepository, OptionsRepository optionsRepository) {
        this.questionRepository = questionRepository;
        this.optionsRepository = optionsRepository;
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
