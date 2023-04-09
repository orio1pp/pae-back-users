package com.example.demo.DTOs;

import com.example.demo.model.Options;
import lombok.AllArgsConstructor;


import java.util.List;

@AllArgsConstructor
public class QuestionDTO {
    private String questionText;

    private String type;

    private int page;

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
}
