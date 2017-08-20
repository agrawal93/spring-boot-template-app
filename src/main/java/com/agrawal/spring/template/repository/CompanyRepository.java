package com.agrawal.spring.template.repository;

import com.agrawal.spring.template.model.Company;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
public interface CompanyRepository extends CrudRepository<Company, String> {
    
}