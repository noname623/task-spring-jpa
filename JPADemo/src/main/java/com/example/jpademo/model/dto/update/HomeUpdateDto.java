package com.example.jpademo.model.dto.update;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HomeUpdateDto {
    @Size(min = 10, max = 20)
    private String address;
}
