package com.springmvc.web.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistrationDto {
    public Long id;
    @NotEmpty
    public String username;
    @NotEmpty
    public String email;
    @NotEmpty
    public String password;
}
