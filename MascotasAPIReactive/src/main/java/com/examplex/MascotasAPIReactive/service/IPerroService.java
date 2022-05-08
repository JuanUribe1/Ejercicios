package com.examplex.MascotasAPIReactive.service;

import com.examplex.MascotasAPIReactive.models.Perro;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPerroService {
    Mono<Perro> save(Perro user);
    Flux<Perro> getAll();
    Mono<Perro> getById(String userId);
    Mono<Perro> update(Perro userActualizado);
    Mono<Perro> delete(String id);
}
