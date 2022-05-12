package com.examplex.PruebaTesting.repository;

import com.examplex.PruebaTesting.model.Perro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerroRepository extends MongoRepository<Perro, String> {
}
