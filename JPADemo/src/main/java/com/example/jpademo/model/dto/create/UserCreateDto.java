package com.example.jpademo.model.dto.create;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserCreateDto {

    @NotBlank
    @Size(min = 4, max = 10)
    private String name;

    @Min(18)
    @Max(60)
    @NotNull
    private Integer age;

    @NotBlank
    @Email
    private String email;
}
