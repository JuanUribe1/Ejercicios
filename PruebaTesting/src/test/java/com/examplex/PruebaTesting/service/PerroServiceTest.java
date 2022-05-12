package com.examplex.PruebaTesting.service;

import com.examplex.PruebaTesting.model.Perro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PerroServiceTest {

    @Autowired
    PerroService perroService;


    Perro perro = new Perro();

    @BeforeEach
    void setUp() {

        perro.set_id("1");
        perro.setAnoNacimiento(2016);
        perro.setNombre("Rita");

        Mockito.when(perroService.get("1")).thenReturn(Optional.of(perro));
    }

    @Test
    void calcularEdadPerro() {
        PerroService perroService = new PerroService();
        Perro perro = new Perro();
        perro.setAnoNacimiento(2016);
        perro.setNombre("Rita");
        assertEquals(59.6, perroService.calcularEdadPerro(perro.getAnoNacimiento()), 0.9);
    }

    @Test
    void save() {

        assertEquals(perroService.save(perro), perroService.get("1"));
    }
}