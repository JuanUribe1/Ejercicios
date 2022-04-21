import org.examples.Cargame.domain.*;

public class Application {
    public static void main(String[] args) {
        int numCarriles = 3;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles, kilometros, "Pista#me muero");

        Carro rojo = new Carro(Carro.Color.ROJO, "xx1");
        rojo.agregarConductor(new Conductor("C1", "Raul", "raul@email.com", "raul"));
        Carro azul = new Carro(Carro.Color.AZUL, "xx2");
        azul.agregarConductor(new Conductor("C2", "Andres", "Andres@email.com", "Andres"));
        Carro negro = new Carro(Carro.Color.NEGRO, "xx3");
        negro.agregarConductor(new Conductor("C3", "Pedro", "Pedro@email.com", "Pedro"));
        Carro blanco = new Carro(Carro.Color.BLANCO, "xx4");
        blanco.agregarConductor(new Conductor("C4", "Ana", "Ana@email.com", "Ana"));

        juego.agregarCarroACarril(1, rojo);
        juego.agregarCarroACarril(2, azul);
        juego.agregarCarroACarril(3, negro);
        juego.agregarCarroACarril(1, blanco);

        Podium podium = juego.iniciarJuego();
        System.out.println(podium);
    }
}
