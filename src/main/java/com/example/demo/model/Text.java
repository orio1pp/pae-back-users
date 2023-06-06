package com.example.demo.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("TEXT")
public class Text extends Options {
    private String typeChar;

    private int maxChars;

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
}
