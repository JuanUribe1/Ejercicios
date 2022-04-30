package com.examplex.CRUDMongoSpringBoot.model;

import org.springframework.data.annotation.Id;

public class Libro {
    @Id
    private String id;
    private String nombre;
    private String genero;
    private String editorial;
    private String escritor;

    public Libro() {
    }

    public Libro(String id, String nombre, String genero, String editorial, String escritor) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.editorial = editorial;
        this.escritor = escritor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
}
