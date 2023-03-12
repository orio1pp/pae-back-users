package com.example.demo.Model;

import java.io.Serializable;

public class QuestionId implements Serializable {
    private long questionary_id;

    private long question_id;

    public long getQuestionary_id() {
        return questionary_id;
    }

    public void setQuestionary_id(long questionary_id) {
        this.questionary_id = questionary_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }


}
