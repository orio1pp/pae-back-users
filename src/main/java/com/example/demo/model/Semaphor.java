package com.example.demo.model;

import com.example.demo.Utils.ConstantsUtils;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Semaphor extends Options {
    private ConstantsUtils.SemaphoreType color;

    public ConstantsUtils.SemaphoreType getColor() {
        return color;
    }

    public void setColor(ConstantsUtils.SemaphoreType color) {
        this.color = color;
    }
}
