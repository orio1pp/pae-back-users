package service;

import Model.Question;
import org.springframework.stereotype.Service;
import repository.QuestionRepository;

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
