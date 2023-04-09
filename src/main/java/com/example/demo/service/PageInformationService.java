package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.model.PageInformation;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.PageInformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageInformationService {
    private final PageInformationRepository pageInformationRepository;
    private final CompanyRepository companyRepository;

    public PageInformationService(PageInformationRepository pageInformationRepository, CompanyRepository companyRepository) {
        this.pageInformationRepository = pageInformationRepository;
        this.companyRepository = companyRepository;
    }

    public void updatePageInformation(PageInformation pageInformation, String companyName){
        //TODO: comprobar que la pagina es de la companyia
        String pageName = pageInformation.getPageName();
        if(checkPageExists(pageName)) {
            //TODO: faltaria poner checks
            PageInformation actualPageInformation = pageInformationRepository.getPageInformationByPageName(pageName);
            actualPageInformation.setInformation(pageInformation.getInformation());
            actualPageInformation.setVideoUrl(pageInformation.getVideoUrl());
            actualPageInformation.setTitle(pageInformation.getTitle());
            actualPageInformation.setNameImage(pageInformation.getNameImage());
            pageInformationRepository.save(actualPageInformation);
        }
    }

    public List<PageInformation> getCompanyPages(String companyName) {
        if(checkCompanyExists(companyName)){
           Company company  = companyRepository.findByCompanyName(companyName);
           return company.getPageInformationList();
        }
        return null;
    }

    public PageInformation getCompanyPageInformation(String pageName, String companyName) {
        if(checkCompanyExists(companyName)){
           if(checkPageExists(pageName)){
               Company company = companyRepository.findByCompanyName(pageName);
               List<PageInformation> companyPages = company.getPageInformationList();
               return checkCompanyOwnsPage(companyPages, pageName);
           }
        }
        return null;
    }
    public void setCompanyPages(List<PageInformation> companyPages, String companyName) {
        if(checkCompanyExists(companyName)){
           Company company = companyRepository.findByCompanyName(companyName);
           List<PageInformation> actualCompanyPages = company.getPageInformationList();
           for(PageInformation page: companyPages){
               actualCompanyPages.add(page);
           }
           company.setPageInformationList(actualCompanyPages);
           companyRepository.save(company);
        }
    }

    public void setCompanyPage(PageInformation companyPage, String companyName) {
        if(checkCompanyExists(companyName)){
            Company company = companyRepository.findByCompanyName(companyName);
            List<PageInformation> actualCompanyPages = company.getPageInformationList();
            actualCompanyPages.add(companyPage);
            company.setPageInformationList(actualCompanyPages);
            companyRepository.save(company);
        }
    }

    private PageInformation checkCompanyOwnsPage(List<PageInformation> companyPages, String pageName){
        for(PageInformation pageInformation : companyPages){
            if(pageInformation.getPageName().equals(pageName)) {
                return pageInformation;
            }
        }
        return null;
    }

    private boolean checkCompanyExists(String companyName){
        return companyRepository.existsByCompanyName(companyName);
    }

    private boolean checkPageExists(String pageName){
        return pageInformationRepository.existsByPageName(pageName);
    }
}
