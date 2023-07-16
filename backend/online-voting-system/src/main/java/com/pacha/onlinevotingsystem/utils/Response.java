package com.pacha.onlinevotingsystem.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String message;
    private Date timestamp;
    private HttpStatus status;
}
