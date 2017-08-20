package com.agrawal.spring.template.controller;

import com.agrawal.spring.template.exceptions.CompanyNotFoundException;
import com.agrawal.spring.template.model.Company;
import com.agrawal.spring.template.service.CompanyService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
@RestController
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;
    
    @GetMapping(
            value = "/",
            produces = { "application/json" }
    )
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
    
    @GetMapping(
            value = "/{companyId}",
            produces = { "application/json" }
    )
    public Company getCompany(@PathVariable String companyId) {
        return companyService.getCompany(companyId);
    }
    
    @PostMapping(
            value = "/",
            consumes = { "application/json" },
            produces = { "application/json" }
    )
    public Company addCompany(@RequestBody Company company) throws IOException {
        companyService.addCompany(company);
        return company;
    }
    
    @PutMapping(
            value = "/{companyId}",
            consumes = { "application/json" },
            produces = { "application/json" }
    )
    public Company updateCompany(@RequestBody Company company, @PathVariable String companyId) {
        companyService.updateCompany(companyId, company);
        return company;
    }
    
    @DeleteMapping("/{companyId}")
    public void deleteCompany(@PathVariable String companyId) {
        companyService.deleteCompany(companyId);
    }
    
    @ExceptionHandler(CompanyNotFoundException.class)
    void handleNotFound(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value());
    }
    
}
