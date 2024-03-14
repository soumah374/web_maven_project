package com.springmvc.web.service.Impl;

import com.springmvc.web.dto.RoleDto;
import com.springmvc.web.dto.UserEntityDto;
import com.springmvc.web.models.Role;
import com.springmvc.web.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public Role findByName(String name) {
        return null;
    }

    @Override
    public void createRole(RoleDto roleDto) {

    }

    private RoleDto mapToRoleDto(RoleDto roleDto){

        return RoleDto.builder()
                .id(roleDto.getId())
                .name(roleDto.getName())
                .build();
    }

}
