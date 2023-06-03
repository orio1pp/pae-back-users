package com.example.demo.DTOs;

public class AnswerSelectedDTO {

    private int timesSelected;

    private String answer;

    public AnswerSelectedDTO(int timesSelected, String answer) {
        this.timesSelected = timesSelected;
        this.answer = answer;
    }

    public int getTimesSelected() {
        return timesSelected;
    }

    public void setTimesSelected(int timesSelected) {
        this.timesSelected = timesSelected;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
