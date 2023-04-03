package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@DiscriminatorValue("CHECKBOX")
@DiscriminatorOptions(force=true)
@AllArgsConstructor
@NoArgsConstructor
public class CheckBox extends Options{

    @Column
    private String options;

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
