package com.agrawal.spring.template.model;

/**
 *
 * @author Hardik Agrawal [ hardik93@ymail.com ]
 */
public class ErrorResponse {
    
    private int code; // HTTP Status Code
    private String error; // HTTP Error Status
    
    private long timestamp; // Error Timestamp
    private String exception; // Exception occurred
    private String message; // Details of the exception
    
}
