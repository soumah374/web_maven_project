package com.springmvc.web.service;

import com.springmvc.web.dto.RegistrationDto;
import com.springmvc.web.dto.UserEntityDto;
import com.springmvc.web.models.UserEntity;

public interface UserEntityService {

    UserEntity findByEmail(String email);
    UserEntity findByUsername(String userName);

    void createUser(RegistrationDto registrationDto);

}
