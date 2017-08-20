package com.agrawal.spring.template.exceptions;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
public class CompanyNotFoundException extends RuntimeException {

    public CompanyNotFoundException(String message) {
        super(message);
    }

    public CompanyNotFoundException(Throwable cause) {
        super(cause);
    }
    
    public CompanyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
