package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
