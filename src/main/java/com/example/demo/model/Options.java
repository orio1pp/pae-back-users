package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "options")
@AllArgsConstructor
@NoArgsConstructor
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long options_id;

    public Long getOptions_id() {
        return options_id;
    }

    public void setOptions_id(Long options_id) {
        this.options_id = options_id;
    }
}
