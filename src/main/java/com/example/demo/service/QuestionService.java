package com.example.demo.service;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
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

    public void setMultipleQuestions(List<Question> questions) {
        for (Question question : questions) {
            questionRepository.save(question);
            //for (Answer ans : question.getAnswers()) answerRepository.save(ans);
        }
    }

    public List<Question> getAllQuestions() {
        return (List<Question>) questionRepository.findAll();
    }
}
