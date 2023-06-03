package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CheckBox extends Options{

    @Column
    private String options;


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Traduccion traduccion;

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Traduccion getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(Traduccion traduccion) {
        this.traduccion = traduccion;
    }
}
