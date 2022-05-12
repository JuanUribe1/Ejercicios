package com.examplex.PruebaTesting.service;

import com.examplex.PruebaTesting.model.Perro;

import java.util.List;
import java.util.Optional;

public interface IPerroService{
    Perro save(Perro entity);

    void delete(String id);

    Optional<Perro> get(String id);

    List<Perro> getAll();
}
