package com.examplex.SpringSecurity.service;

import com.examplex.SpringSecurity.model.User;
import com.examplex.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public void createUser(){
        User us = new User();
        us.setUsername("admin");
        us.setPassword(encoder.encode("admin"));
        System.out.println(encoder.encode("admin"));
        repo.save(us);
    }

}
