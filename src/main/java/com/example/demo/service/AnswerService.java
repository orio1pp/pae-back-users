package com.example.demo.service;

import com.example.demo.model.Answer;
import com.example.demo.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public void answerQuestionary(List<Answer> answers) {
        for(Answer answer: answers){
            answerRepository.save(answer);
        }
    }

    public int getTimesOptionSelected(String answer) {
        return answerRepository.getTimesSelected(answer);
    }

}
