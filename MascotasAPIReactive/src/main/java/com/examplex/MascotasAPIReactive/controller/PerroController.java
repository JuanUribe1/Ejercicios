package com.examplex.MascotasAPIReactive.controller;

import com.examplex.MascotasAPIReactive.models.Perro;
import com.examplex.MascotasAPIReactive.service.PerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/perros")
public class PerroController {

    @Autowired
    PerroService perroService;

    @GetMapping("/edadperro/{id}")
    public Mono<Perro> calcularEdad(@PathVariable String id){
        return perroService.getById(id)
                .flatMap(perro -> {
                    return perroService.calcularEdad(perro);
        });
    }

    @GetMapping("/")
    public Flux<Perro> getAll(){
        return perroService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Perro> getById(@PathVariable String id){
        return perroService.getById(id);
    }

    @PostMapping("/")
    public Mono<Perro> save(@RequestBody Perro perro){
        return perroService.save(perro);
    }

    @PutMapping("/")
    public Mono<Perro> update(@RequestBody Perro perro){
        return perroService.update(perro);
    }

    @DeleteMapping("/{id}")
    public Mono<Perro> delete(@PathVariable String id){
        return perroService.delete(id);
    }

}
