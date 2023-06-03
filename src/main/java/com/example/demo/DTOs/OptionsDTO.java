package com.example.demo.DTOs;

import com.example.demo.model.Traduccion;

public class OptionsDTO {
    private String text;

    private Traduccion traduccion;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Traduccion getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(Traduccion traduccion) {
        this.traduccion = traduccion;
    }
}
