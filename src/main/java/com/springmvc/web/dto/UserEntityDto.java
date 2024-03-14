package com.springmvc.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntityDto {
    public Long id;
    public String username;
    public String email;
    public String password;
}
