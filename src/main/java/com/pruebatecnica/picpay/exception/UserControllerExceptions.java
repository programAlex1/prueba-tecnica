package com.pruebatecnica.picpay.exception;


import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class UserControllerExceptions {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerValidateException(MethodArgumentNotValidException e){
            Map<String, String> errors = new HashMap<>();
            e.getBindingResult().getAllErrors().forEach(error -> {
                String fieldName = ((FieldError) error).getField();
                String message = error.getDefaultMessage();
                errors.put(fieldName,message);
            }
            );
            return errors;
    }

}
