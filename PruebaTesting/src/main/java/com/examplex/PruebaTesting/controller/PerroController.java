package com.examplex.PruebaTesting.controller;

import com.examplex.PruebaTesting.model.Perro;
import com.examplex.PruebaTesting.service.PerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/perros")
public class PerroController {

    @Autowired
    PerroService perroService;


    @GetMapping("/edadperro/{id}")
    public Perro calcularEdad(@PathVariable String id){
        Perro perroDB = perroService.get(id).get();
        perroDB.setEdad(perroService.calcularEdadPerro(perroDB.getAnoNacimiento()));
        perroService.save(perroDB);
        return perroDB;
    }

    @GetMapping("/")
    public List<Perro> getAll(){
        return perroService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Perro> findById(@PathVariable String id) {
        return perroService.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/")
    public Perro save(@RequestBody Perro usuario){
        return perroService.save(usuario);
    }

    @PutMapping()
    public Perro update(@Validated @RequestBody Perro p){
        return perroService.save(p);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable("id") String idPerro){
        perroService.delete(idPerro);
    }
}
