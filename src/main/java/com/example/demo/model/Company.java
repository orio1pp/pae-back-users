package com.example.demo.model;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Company")
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(unique = true)
    private String companyName;

    @Column
    private String password;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<PageInformation> pageInformationList;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Traduccion> traduccion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PageInformation> getPageInformationList() {
        return pageInformationList;
    }

    public void setPageInformationList(List<PageInformation> pageInformationList) {
        this.pageInformationList = pageInformationList;
    }

    public List<Traduccion> getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(List<Traduccion> traduccion) {
        this.traduccion = traduccion;
    }
}
