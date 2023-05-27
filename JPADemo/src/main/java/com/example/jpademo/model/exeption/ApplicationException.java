package com.example.jpademo.model.exeption;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApplicationException extends Error{
    private ExceptionMessage exeptionMessage;
}
