package com.springmvc.web.controller;

import com.springmvc.web.service.UserEntityService;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    UserEntityService userEntityService;

    public AuthController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }


}
