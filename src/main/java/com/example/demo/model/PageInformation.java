package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "InformationPage")
public class CompanyInformation {
    @Id
    @Column
    private long id;

    @Column
    private String title;

    @Column
    private String generalInformation;

    @Column
    private String videoUrl;
}
