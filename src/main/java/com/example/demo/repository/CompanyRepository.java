package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {

    public boolean existsByCompanyName(String companyName);

    public Company findByCompanyName(String companyName);
}
