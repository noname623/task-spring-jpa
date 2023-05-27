package com.example.jpademo.model.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HomeDto {
    private Long id;

    @Size(min = 10, max = 20)
    private String address;
}
