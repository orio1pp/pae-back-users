package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "question")
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column
    private long questionId;

    @Column
    private String questionText;

    private String type;

    @Column
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Options> optionsList;

    public Question(String questionText, List<Options> options, String type) {
        this.questionText = questionText;
        this.optionsList = options;
        this.type = type;
    }


    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public List<Options> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<Options> optionsList) {
        this.optionsList = optionsList;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
