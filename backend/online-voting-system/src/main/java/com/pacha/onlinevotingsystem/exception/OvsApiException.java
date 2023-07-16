package com.pacha.onlinevotingsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class OvsApiException extends RuntimeException{

    private HttpStatus status;
    private String message;

    public OvsApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public OvsApiException(String s, HttpStatus status, String message) {
        super(s);
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
