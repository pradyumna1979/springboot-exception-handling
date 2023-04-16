package com.exception.dto;

import lombok.*;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    @Min(18)
    @Max(60)
    private int age;
    @NotNull(message ="User name should not be null" )
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number entered")
    private String mobile;
    private String gender;
    @NotBlank
    private String nationality;
}
