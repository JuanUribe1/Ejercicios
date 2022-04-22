public class Aplicacion {
    public static void main(String[] args) {
        Juego juego =new Juego(5);
        juego.MuestraVidasRestantes();
        juego.quitaVida();
        juego.MuestraVidasRestantes();
        juego.reiniciaPartida();
        juego.MuestraVidasRestantes();
        juego.actualizaRecord();
        Juego juego2 =new Juego(5);
        juego2.MuestraVidasRestantes();
        juego2.actualizaRecord();
        juego.MuestraVidasRestantes();
    }
}
