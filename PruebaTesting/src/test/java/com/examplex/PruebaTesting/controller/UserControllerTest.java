package com.examplex.PruebaTesting.controller;

import com.examplex.PruebaTesting.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserControllerTest {

    @Autowired
    private UserController userController;

    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        user = new User();
        user.set_id("1");
        user.setUsername("cirilo");
        user.setPassword("cirilin");
    }

    @Test
    void findAll() {
        when(userController.findAll()).thenReturn(Arrays.asList(user));
        assertNotNull(userController.findAll());
    }
}