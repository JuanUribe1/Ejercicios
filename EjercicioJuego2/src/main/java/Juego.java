public class Juego {
    private Integer vidas, vidasIniciales, record=0;
    public Juego(Integer vidasIniciales){
        this.vidasIniciales = vidasIniciales;
        this.vidas = vidasIniciales;
    }
    public void MuestraVidasRestantes(){
        System.out.println(vidas);
    }
    public boolean quitaVida(){
        if(vidas>0){
            vidas = vidas - 1;
            return true;
        }else{
            System.out.println("Juego terminado");
            return false;
        }
    }
    public void reiniciaPartida(){
        vidas=vidasIniciales;
    }
    public void actualizaRecord(){
        if(vidas==record){
            System.out.println("Ha alcanzado el record");
        } else if (vidas > record) {
            System.out.println("El record de "+record+" vidas se ha batido con "+vidas+" vidas");
            record=vidas;
        }
    }
}
