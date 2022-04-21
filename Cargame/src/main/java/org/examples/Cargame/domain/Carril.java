package org.examples.Cargame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carril {
    private List<Carro> carros;
    private Integer numero;
    private final Integer kilometros;

    public Carril(Integer numero, Integer kilometros) {
        this.kilometros = Objects.requireNonNull(kilometros);
        this.numero = Objects.requireNonNull(numero);
        this.carros = new ArrayList<>();
        if(kilometros<=0){
            throw new IllegalArgumentException("no es un kilometro permitido");
        }
    }
    public Integer progresoCarro(String placa){
        for(Carro carro : this.carros){
            if(carro.placa().equalsIgnoreCase(placa)){
                int metros = getKilometros()*1000;
                return (100*carro.getMetros()/metros);
            }
        }
        throw new IllegalArgumentException("No existe el carro");
    }
    public void agregarCarro(Carro carro){
        carros.add(carro);
    }
    public Integer getKilometros(){
        return kilometros;
    }

    public Integer getNumero() {
        return numero;
    }
    public List<Carro> carros(){
        return carros;
    }
}
