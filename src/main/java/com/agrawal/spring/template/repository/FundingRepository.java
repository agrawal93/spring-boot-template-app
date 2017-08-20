package com.agrawal.spring.template.repository;

import com.agrawal.spring.template.model.Funding;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
public interface FundingRepository extends CrudRepository<Funding, Integer> {
    
}
