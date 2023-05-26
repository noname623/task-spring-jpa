package com.example.jpademo.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    @Size(min = 4, max = 10)
    private String name;

    @Min(18)
    @Max(60)
    private Integer age;

    @Email
    private String email;
}
