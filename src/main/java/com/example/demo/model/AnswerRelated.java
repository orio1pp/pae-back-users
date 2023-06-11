package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "answerRelated")
@AllArgsConstructor
@NoArgsConstructor
public class AnswerRelated {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column
    private long id;
    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Question> questionsRelated;
    @Column
    private String answer;

    public List<Question> getQuestionsRelated() {
        return questionsRelated;
    }

    public void setQuestionsRelated(List<Question> questionsRelated) {
        this.questionsRelated = questionsRelated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
