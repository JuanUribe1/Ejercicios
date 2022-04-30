package com.examplex.CRUDMongoSpringBoot.service.impl;

import com.examplex.CRUDMongoSpringBoot.dao.api.LibroRepository;
import com.examplex.CRUDMongoSpringBoot.model.Libro;
import com.examplex.CRUDMongoSpringBoot.service.api.LibroServiceAPI;
import commons.GenericServiceAPI;
import commons.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends GenericServiceImpl<Libro, String> implements LibroServiceAPI {
    @Autowired
    LibroRepository libroRepository;
    @Override
    public CrudRepository<Libro, String> getDao() {
        return libroRepository;
    }
}
