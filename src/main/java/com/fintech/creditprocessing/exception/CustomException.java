package com.fintech.creditprocessing.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

// Посмотреть аннотации дл яиммутабельных классов (@Value)
@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
    private String code;
    private String message;
}
