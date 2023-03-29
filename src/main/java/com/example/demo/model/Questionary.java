package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Questionary")
@AllArgsConstructor
@NoArgsConstructor
public class Questionary implements Serializable {

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long questionary_id;

    @Column
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Question> questions;

    public long getQuestionary_id() {
        return questionary_id;
    }

    public void setQuestionary_id(long questionary_id) {
        this.questionary_id = questionary_id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



}
