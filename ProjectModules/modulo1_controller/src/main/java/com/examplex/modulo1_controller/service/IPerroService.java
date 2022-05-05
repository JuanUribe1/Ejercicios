package com.examplex.modulo1_controller.service;

import com.examplex.modulo1_controller.models.Perro;

import java.util.List;
import java.util.Optional;

public interface IPerroService{
    Perro save(Perro entity);

    void delete(String id);

    Optional<Perro> get(String id);

    List<Perro> getAll();
}
