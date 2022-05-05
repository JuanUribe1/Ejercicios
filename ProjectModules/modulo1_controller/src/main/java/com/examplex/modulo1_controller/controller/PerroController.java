package com.examplex.modulo1_controller.controller;

import com.examplex.modulo1_controller.models.Perro;
import com.examplex.modulo1_controller.service.PerroService;
import com.examplex.modulo2_service.ServicioFullLogic;
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
        ServicioFullLogic servicio = new ServicioFullLogic();
        perroDB.setEdad(servicio.calcularEdadPerro(perroDB.getAnoNacimiento()));
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
