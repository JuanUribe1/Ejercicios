public class Juego {
    public Integer vidas;
    public Juego(Integer vidasIniciales){
        this.vidas = vidasIniciales;
    }
    public void MuestraVidasRestantes(){
        System.out.println(vidas);
    }

    public static void main(String[] args) {
        Juego juego =new Juego(5);
        juego.MuestraVidasRestantes();
        juego.vidas = juego.vidas-1;
        juego.MuestraVidasRestantes();
        Juego juego2 =new Juego(5);
        juego2.MuestraVidasRestantes();
        juego.MuestraVidasRestantes();
    }
}
