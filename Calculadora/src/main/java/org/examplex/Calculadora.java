package org.examplex;

public class Calculadora {
    public double sumar(double a, double b){
        return a + b;
    }
    public double restar(double a, double b){
        return a - b;
    }
    public double multiplicar(double a, double b){
        return a * b;
    }
    public double dividir(double a, double b){
        if(b!=0) {
            return a / b;
        }else{
            return -1;
        }
    }
}
