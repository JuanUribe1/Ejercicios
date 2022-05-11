package com.examplex.SpringSecurity.controller;

import com.examplex.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public void crear(){
        userService.createUser();
    }

}
