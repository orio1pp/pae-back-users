package com.example.demo.DTOs;

import com.example.demo.model.*;
import lombok.AllArgsConstructor;


import java.util.List;

@AllArgsConstructor
public class QuestionDTO {
    private String questionText;

    private String type;

    private int page;

    private List<OptionsDTO> optionsList;

    private QuestionInformation questionInformation;

    private List<Traduccion> traduccion;

    private String compulsory;

    private List<AnswerRelated> answerRelateds;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<OptionsDTO> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<OptionsDTO> optionsList) {
        this.optionsList = optionsList;
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

    public List<Traduccion> getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(List<Traduccion> traduccion) {
        this.traduccion = traduccion;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    public List<AnswerRelated> getAnswerRelateds() {
        return answerRelateds;
    }

    public void setAnswerRelateds(List<AnswerRelated> answerRelateds) {
        this.answerRelateds = answerRelateds;
    }
}
