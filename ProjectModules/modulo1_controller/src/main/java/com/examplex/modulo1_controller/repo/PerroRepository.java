package com.examplex.modulo1_controller.repo;

import com.examplex.modulo1_controller.models.Perro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerroRepository extends MongoRepository<Perro, String> {
}
