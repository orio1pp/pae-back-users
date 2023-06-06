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

    private int page;

    @Column
    private String compulsory;

    @Column
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Options> optionsList;

    @OneToOne(cascade = CascadeType.ALL)
    private QuestionInformation questionInformation;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Question> questionsRelated;

    @Column
    private String answerToQuestionsRelated;

    @OneToOne(cascade = CascadeType.ALL)
    private Traduccion traduccion;

    public Question(String questionText, List<Options> options, String type, int page, QuestionInformation questionInformation, Traduccion traduccion, String compulsory, List<Question> questionsRelated,
                    String answerToQuestionsRelated) {
        this.questionText = questionText;
        this.optionsList = options;
        this.type = type;
        this.page = page;
        this.questionInformation = questionInformation;
        this.traduccion = traduccion;
        this.compulsory = compulsory;
        this.questionsRelated = questionsRelated;
        this.answerToQuestionsRelated = answerToQuestionsRelated;
    }

    public List<Question> getQuestionsRelated() {
        return questionsRelated;
    }

    public void setQuestionsRelated(List<Question> questionsRelated) {
        this.questionsRelated = questionsRelated;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public QuestionInformation getQuestionInformation() {
        return questionInformation;
    }

    public void setQuestionInformation(QuestionInformation questionInformation) {
        this.questionInformation = questionInformation;
    }

    public Traduccion getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(Traduccion traduccion) {
        this.traduccion = traduccion;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    public String getAnswerToQuestionsRelated() {
        return answerToQuestionsRelated;
    }

    public void setAnswerToQuestionsRelated(String answerToQuestionsRelated) {
        this.answerToQuestionsRelated = answerToQuestionsRelated;
    }
}
