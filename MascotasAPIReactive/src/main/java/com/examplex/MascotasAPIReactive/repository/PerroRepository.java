package com.examplex.MascotasAPIReactive.repository;

import com.examplex.MascotasAPIReactive.models.Perro;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerroRepository extends ReactiveMongoRepository<Perro, String> {
}
