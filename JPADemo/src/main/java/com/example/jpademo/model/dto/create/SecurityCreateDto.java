package com.example.jpademo.model.dto.create;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SecurityCreateDto {
    @Size(min = 4, max = 10)
    private String name;
    @Min(18)
    @Max(35)
    private Integer age;
    @Size(min = 10, max = 20)
    private String post;
}
