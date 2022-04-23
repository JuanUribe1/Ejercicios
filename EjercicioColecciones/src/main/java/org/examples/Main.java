package org.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido sistema de notas del estudiante");
        System.out.println("Ingrese nombre del estudiante");
        String nombreEst = sc.next();
        List<Double> notas = new ArrayList<Double>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingese nota "+(i+1));
            notas.add(sc.nextDouble());

        }
        Estudiante est = new Estudiante("0001", nombreEst, notas);
        Collections.sort(notas, Collections.reverseOrder());
        System.out.println("Notas: ");
        for (Double num:est.getNotas()) {
            System.out.println(num);
        }
        System.out.println("Estudiante: "+est.getNombre()+", Promedio: "+est.getPromedio());
    }
}