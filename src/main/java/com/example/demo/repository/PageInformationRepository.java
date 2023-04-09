package com.example.demo.repository;

import com.example.demo.model.PageInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageInformationRepository extends CrudRepository<PageInformation, Long> {

    public boolean existsByPageName(String pageName);

    public PageInformation getPageInformationByPageName(String pageName);
}
