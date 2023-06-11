package com.example.demo.DTOs;

import com.example.demo.model.Options;
import com.example.demo.model.Traduccion;

import java.util.List;

public class OptionsDTO {
    private String text;

    private String typeChar;

    private int maxChars;

    private List<Traduccion> traduccion;

    private List<Options> optionsList;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Traduccion> getTraduccion() {
        return traduccion;
    }

    public String getTypeChar() {
        return typeChar;
    }

    public void setTypeChar(String typeChar) {
        this.typeChar = typeChar;
    }

    public int getMaxChars() {
        return maxChars;
    }

    public void setMaxChars(int maxChars) {
        this.maxChars = maxChars;
    }

    public void setTraduccion(List<Traduccion> traduccion) {
        this.traduccion = traduccion;
    }

    public List<Options> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<Options> optionsList) {
        this.optionsList = optionsList;
    }
}
