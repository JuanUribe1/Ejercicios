package com.examplex.CRUDMongoSpringBoot.dao.api;

import com.examplex.CRUDMongoSpringBoot.model.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibroRepository extends MongoRepository<Libro, String> {

}
