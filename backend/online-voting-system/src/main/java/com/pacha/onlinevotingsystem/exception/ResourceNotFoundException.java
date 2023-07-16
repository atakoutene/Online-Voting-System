package com.pacha.onlinevotingsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private Long fieldValue;

    private String fieldValue2;

    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValue) {
        super(String.format("%s not found with %s: %s", resourceName, fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue2) {
        super(String.format("%s not found with %s: %s", resourceName, fieldName, fieldValue2));
        this.fieldName = fieldName;
        this.fieldValue2 = fieldValue2;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException() {
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Long getFieldValue() {
        return fieldValue;
    }
}
