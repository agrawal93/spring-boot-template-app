package com.agrawal.spring.template.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
@Entity
public class Funding {
    @Id
    @GeneratedValue
    public int id;

    public long amount;
    public Date date;
    public String stage;
    public String investor;
}
