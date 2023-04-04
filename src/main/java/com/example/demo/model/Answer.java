package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "answer")
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column
    private long answerId;
    @OneToOne(fetch = FetchType.LAZY)
    private Question questionId;
    @Column
    private String answer;

    @Column
    private String type;

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
