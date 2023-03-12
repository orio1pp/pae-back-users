package controller;

import Model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.QuestionService;

import java.util.List;

@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping("questions")
    public ResponseEntity<Question> setMultipleQuestions(List<Question> questions){
        if(questions != null){
            questionService.setMultipleQuestions(questions);
        }
        return ResponseEntity.ok(questions.get(0));
    }
    @GetMapping("test")
    public String RetornString() { return "hola"; }
}
