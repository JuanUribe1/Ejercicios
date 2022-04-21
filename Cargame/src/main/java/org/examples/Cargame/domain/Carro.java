package org.examples.Cargame.domain;

import java.util.Objects;

public class Carro {
    private final Color color;
    private final String placa;
    private Conductor conductor;
    private Integer metros;
    private boolean estaEnMarcha;

    public Carro(Color color, String placa, Integer metros) {
        this.color = color;
        this.placa = placa;
        this.metros = metros;
        this.estaEnMarcha = false;
        if(metros<0){
            throw new IllegalArgumentException("No se puede tener metros negativos");
        }
    }


    public Carro(Color color, String placa) {
        this(color, placa, 0);
    }
    public void iniciar(){
        this.estaEnMarcha = true;
    }
    public void pararMarcha(){
        this.estaEnMarcha = false;
    }
    public boolean estaEnMarcha(){
        return estaEnMarcha;
    }

    public void agregarConductor(Conductor conductor){
        this.conductor = Objects.requireNonNull(conductor);
    }
    public void aumentarMetros(){
        if(this.estaEnMarcha) {
            this.metros = metros + 1;
        }
    }
    public double getKilometros(){
        return Math.ceil((double)metros/1000);
    }

    public Integer getMetros() {
        return metros;
    }
    public Conductor getConductor(){
        return conductor;
    }
    public Color color(){
        return color;
    }
    public String placa(){
        return placa;
    }
    public enum Color{
        ROJO, BLANCO, NEGRO, AZUL
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color=" + color +
                ", placa='" + placa + '\'' +
                ", conductor=" + conductor +
                ", metros=" + metros +
                '}';
    }
}
