package com.examplex.modulo2_service;

public class ServicioFullLogic {
    public int calcularEdadPerro(int anoNacimiento){
        return (int)(16 * Math.log(2022-anoNacimiento) + 31);
    }
}
