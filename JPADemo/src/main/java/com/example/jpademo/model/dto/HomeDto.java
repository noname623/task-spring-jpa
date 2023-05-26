package com.example.jpademo.model.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HomeDto {
    @Size(min = 10, max = 20)
    private String address;
}
