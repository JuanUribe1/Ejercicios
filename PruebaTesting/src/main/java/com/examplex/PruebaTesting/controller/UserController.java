package com.examplex.PruebaTesting.controller;

import com.examplex.PruebaTesting.model.User;
import com.examplex.PruebaTesting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
