package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Questionary")
@AllArgsConstructor
@NoArgsConstructor
public class Questionary implements Serializable {

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long questionaryId;

    @Column
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Question> questions;

    public Questionary(List<Question> questions) {
        this.questions = questions;
    }

    public long getQuestionaryId() {
        return questionaryId;
    }

    public void setQuestionaryId(long questionaryId) {
        this.questionaryId = questionaryId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



}
