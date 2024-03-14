package com.springmvc.web.service.Impl;

import com.springmvc.web.dto.RegistrationDto;
import com.springmvc.web.models.Role;
import com.springmvc.web.models.UserEntity;
import com.springmvc.web.repository.UserRepository;
import com.springmvc.web.service.RoleService;
import com.springmvc.web.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserEntityServiceImpl implements UserEntityService {

    UserRepository userRepository;
    RoleService roleService;

    @Autowired
    public UserEntityServiceImpl(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    @Override
    public UserEntity findByEmail(String email) {
        return null;
    }

    @Override
    public UserEntity findByUsername(String userName) {
        return null;
    }

    @Override
    public void createUser(RegistrationDto registrationDto) {
        /* UserEntity userDto = mapToUserEntity(registrationDto);
        userRepository.save(userDto);*/

        Role role = roleService.findByName("ADMIN");
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(registrationDto.getEmail());
        userEntity.setUsername(registrationDto.getUsername());
        userEntity.setPassword(registrationDto.getPassword());
        userEntity.setRoles(Arrays.asList(role));
        userRepository.save(userEntity);
    }

    private UserEntity mapToUserEntity(RegistrationDto registrationDto){
        return UserEntity.builder()
                .id(registrationDto.getId())
                .email(registrationDto.getEmail())
                .username(registrationDto.getUsername())
                .password(registrationDto.getPassword())
                .build();

    }
}
