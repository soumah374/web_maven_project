package com.springmvc.web.service;

import com.springmvc.web.dto.RoleDto;
import com.springmvc.web.models.Role;

public interface RoleService {

    Role findByName(String name);

    void createRole(RoleDto roleDto);

}
