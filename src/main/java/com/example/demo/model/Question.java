package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Question")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(Question.QuestionId.class)
public class Question implements Serializable {

    @Id
    @Column
    private long questionary_id;

    @Id
    @Column
    private long question_id;

    @Column
    private String question_name;

    @OneToMany(cascade= {CascadeType.ALL})
    private List<Answer> answers;

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

    public String getQuestion_name() {
        return question_name;
    }

    public void setQuestion_name(String question_name) {
        this.question_name = question_name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Embeddable
    public static class QuestionId implements Serializable {
        @Column
        private long questionary_id;

        @Column
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
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            QuestionId questionId = (QuestionId) o;
            return questionary_id == questionId.questionary_id &&
                    question_id == questionId.question_id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.questionary_id, this.question_id);
        }

    }
}
