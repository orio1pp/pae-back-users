package com.example.demo.DTOs;

import com.example.demo.model.Options;


import java.util.List;

public class QuestionDTO {
    private String questionText;

    private List<OptionsDTO> optionsList;

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
}
