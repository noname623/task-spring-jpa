package com.example.jpademo.model.dto.update;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserUpdateDto {
    @Size(min = 4, max = 10)
    private String username;

    @Min(18)
    @Max(60)
    private Integer age;

    @Email
    private String email;
}
