package com.example.jpademo.model.exeption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionMessage {
    ID_NOT_FOUND(HttpStatus.NOT_FOUND, "id is not found");

    private final HttpStatus status;
    private final String massage;


}
