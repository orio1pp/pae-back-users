package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.model.PageInformation;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.service.CompanyService;
import com.example.demo.service.PageInformationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyPagesController {

    private final PageInformationService pageInformationService;

    private final CompanyService companyService;

    public CompanyPagesController(PageInformationService pageInformationService, CompanyService companyService) {
        this.pageInformationService = pageInformationService;
        this.companyService = companyService;
    }


    @GetMapping("pages/company")
    public List<PageInformation> getPagesOfACompany(@RequestParam String companyName){
        //TODO: En un futuro no se pasa nombre de empresa, se pilla del token
        return pageInformationService.getCompanyPages(companyName);
    }

    @GetMapping("page/company")
    public PageInformation getPageInformation(@RequestParam String pageName, @RequestParam String companyName){
        //TODO: En un futuro no se pasa nombre de empresa, se pilla del token
        return pageInformationService.getCompanyPageInformation(pageName, companyName);
    }

    @PostMapping("save/company/pages")
    public void setCompanyPages(@RequestBody List<PageInformation> companyPages, @RequestParam String companyName){
        //TODO: En un futuro no se pasa nombre de empresa, se pilla del token
        pageInformationService.setCompanyPages(companyPages, companyName);
    }

    @PostMapping("save/company")
    public void setCompany(@RequestBody Company company){
        companyService.saveCompany(company);
    }

    @PostMapping("save/company/page")
    public void setCompanyPage(@RequestBody PageInformation companyPage, @RequestParam String companyName){
        //TODO: En un futuro no se pasa nombre de empresa, se pilla del token
        pageInformationService.setCompanyPage(companyPage, companyName);
    }

    @PostMapping("update/company/page")
    public void updateCompanyPage(@RequestBody PageInformation pageInformation, @RequestParam String companyName){
        pageInformationService.updatePageInformation(pageInformation, companyName);
    }
}
