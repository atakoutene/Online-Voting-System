package com.pacha.onlinevotingsystem.exception;

import com.pacha.onlinevotingsystem.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(
                error -> {String fieldName = ((FieldError)error).getField();
                    String message = error.getDefaultMessage();
                    errors.put(fieldName, message);}
        );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage(ex.getMessage());
        errorDetails.setDetails(request.getDescription(false));
        errorDetails.setTimestamp(new Date());

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OvsApiException.class)
    public ResponseEntity<Response> handleCmsApiException(OvsApiException ex, WebRequest request) {
        Response response = new Response();
        response.setMessage(ex.getMessage());
        response.setStatus(ex.getStatus());
        response.setTimestamp(new Date());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    //Global Exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage(ex.getMessage());
        errorDetails.setDetails(request.getDescription(false));
        errorDetails.setTimestamp(new Date());

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
