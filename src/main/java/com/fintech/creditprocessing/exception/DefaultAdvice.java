package com.fintech.creditprocessing.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultAdvice {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleException(CustomException e) {
        return new ResponseEntity<>(new ErrorReport(e.getCode(), e.getMessage()), HttpStatus.I_AM_A_TEAPOT);
    }

}
