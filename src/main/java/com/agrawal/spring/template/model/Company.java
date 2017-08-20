package com.agrawal.spring.template.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
@Entity
public class Company {
    
    @Id
    public String id = UUID.randomUUID().toString().replaceAll("-", "");
    
    @Column(unique = true)
    public String name;
    public String description;
    public String logo;
    
    @OneToMany(targetEntity = Funding.class)
    public List<Funding> fundingDetails;
    
    @ElementCollection
    public Set<String> markets;
    
    public Date foundedOn;
    public String website;
    
    @ElementCollection
    public Map<String, String> socialInformation;
    
}
