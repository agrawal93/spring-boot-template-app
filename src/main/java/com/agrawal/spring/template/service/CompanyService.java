package com.agrawal.spring.template.service;

import com.agrawal.spring.template.exceptions.CompanyNotFoundException;
import com.agrawal.spring.template.model.Company;
import com.agrawal.spring.template.repository.CompanyRepository;
import com.agrawal.spring.template.repository.FundingRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
@Service
public class CompanyService {
    
    @Autowired
    private CompanyRepository companyRepository;
    
    @Autowired
    private FundingRepository fundingRepository;
    
    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }
    
    public Company getCompany(String id) {
        Company company = companyRepository.findOne(id);
        if(company == null) throw new CompanyNotFoundException("Company with id [" + id + "] could not be found");
        return company;
    }
    
    public void addCompany(Company company) {
        company.fundingDetails.forEach(funding -> { fundingRepository.save(funding); });
        companyRepository.save(company);
    }
    
    public void updateCompany(String id, Company company) {
        if(getCompany(id) != null) addCompany(company);
    }
    
    public void deleteCompany(String id) {
        if(getCompany(id) != null) companyRepository.delete(id);
    }
    
}
