package com.example.demo.model;

import com.example.demo.Utils.ConstantsUtils;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Fists extends Options {
    private ConstantsUtils.FistsTypes fistType;

    public ConstantsUtils.FistsTypes getFistType() {
        return fistType;
    }

    public void setFistType(ConstantsUtils.FistsTypes fistType) {
        this.fistType = fistType;
    }
}
