package com.hivecloud.hivecloudbackend.exception.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.stream.Collectors;

@RestControllerAdvice
public class AdviceExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
                                                          HttpStatus status, WebRequest request) {
        CustomizedResponseException exceptionResponse = new CustomizedResponseException(
                ex.getBindingResult().getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST.toString());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
