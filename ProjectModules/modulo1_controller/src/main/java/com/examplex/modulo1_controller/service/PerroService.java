package com.examplex.modulo1_controller.service;

import com.examplex.modulo1_controller.models.Perro;
import com.examplex.modulo1_controller.repo.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerroService implements IPerroService {

    @Autowired
    PerroRepository perroRepository;

    @Override
    public Perro save(Perro entity) {
        return perroRepository.save(entity);
    }

    @Override
    public void delete(String id) {
        perroRepository.delete(perroRepository.findById(id).get());
    }

    @Override
    public Optional<Perro> get(String id) {
        return perroRepository.findById(id);
    }

    @Override
    public List<Perro> getAll() {
        return perroRepository.findAll();
    }
}
