package com.springmvc.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Long id;
    private String name;
}
