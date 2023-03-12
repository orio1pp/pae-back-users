package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Question")
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @EmbeddedId
    private QuestionId question_id;

    @Column
    private long question_name;

    @Column
    private String question_type;

    @Column
    private String possible_answers;

    public long getQuestionary_id() {
        return question_id.getQuestionary_id();
    }

    public void setQuestionary_id(long questionary_id) {
        this.question_id.setQuestionary_id(questionary_id);
    }

    public long getQuestion_id() {
        return question_id.getQuestion_id();
    }

    public void setQuestion_id(long question_id) {
        this.question_id.setQuestion_id(question_id);
    }

    public long getQuestion_name() {
        return question_name;
    }

    public void setQuestion_name(long question_name) {
        this.question_name = question_name;
    }

    public String getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public String getPossible_answers() {
        return possible_answers;
    }

    public void setPossible_answers(String possible_answers) {
        this.possible_answers = possible_answers;
    }
}
