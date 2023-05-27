package com.example.jpademo.controller.advice;

import com.example.jpademo.model.dto.exception.ApplicationExceptionDto;
import com.example.jpademo.model.exeption.ApplicationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler
    public ApplicationExceptionDto exeptionHandler(ApplicationException ex) {
        return new ApplicationExceptionDto(ex.getExeptionMessage().getStatus().toString(), ex.getExeptionMessage().getMassage());
    }
}
