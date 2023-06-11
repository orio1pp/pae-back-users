package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DiscriminatorOptions;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class RadioButton extends Options {

    @Column
    private String options;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Traduccion> traduccion;

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public List<Traduccion> getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(List<Traduccion> traduccion) {
        this.traduccion = traduccion;
    }
}
