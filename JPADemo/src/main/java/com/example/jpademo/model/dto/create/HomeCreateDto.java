package com.example.jpademo.model.dto.create;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HomeCreateDto {
    @Size(min = 10, max = 20)
    private String address;
}
