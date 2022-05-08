package com.examplex.MascotasAPIReactive.service;

import com.examplex.MascotasAPIReactive.models.Perro;
import com.examplex.MascotasAPIReactive.repository.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PerroService implements IPerroService{

    @Autowired
    PerroRepository perroRepository;

    @Override
    public Mono<Perro> save(Perro perro) {
        return perroRepository.save(perro);
    }

    @Override
    public Flux<Perro> getAll() {
        return perroRepository.findAll();
    }

    @Override
    public Mono<Perro> getById(String perroId) {
        return perroRepository.findById(perroId);
    }

    @Override
    public Mono<Perro> update(Perro perroActualizado) {
        return perroRepository.findById(perroActualizado.get_id())
                .flatMap(oldPerro -> {
                    oldPerro.setNombre(perroActualizado.getNombre());
                    oldPerro.setAnoNacimiento(perroActualizado.getAnoNacimiento());
                    oldPerro.setEdad(calcularEdadPerro(perroActualizado.getAnoNacimiento()));
                    return perroRepository.save(oldPerro);
                });
    }

    @Override
    public Mono<Perro> delete(String id) {
        return perroRepository.findById(id)
                .flatMap(deletedPerro -> perroRepository.delete(deletedPerro)
                        .then(Mono.just(deletedPerro)));
    }

    public Mono<Perro> calcularEdad(Perro perro){
        perro.setEdad(calcularEdadPerro(perro.getAnoNacimiento()));
        return update(perro);
    }

    private int calcularEdadPerro(int anoNacimiento){
        return (int)(16 * Math.log(2022-anoNacimiento) + 31);
    }
}
