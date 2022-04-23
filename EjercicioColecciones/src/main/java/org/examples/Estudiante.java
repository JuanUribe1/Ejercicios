package org.examples;

import java.util.List;

public class Estudiante extends Persona {
    private List<Double> notas;
    private double promedio;

    public Estudiante(String id, String Nombre, List<Double> notas) {
        super(id, Nombre);
        this.notas = notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double getPromedio() {
        Double suma=0.0;
        for (Double num:notas) {
            suma+=num;
        }
        promedio = suma/notas.size();
        return promedio;
    }
}
