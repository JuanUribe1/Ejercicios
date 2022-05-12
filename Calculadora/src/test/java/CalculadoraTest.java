import org.examplex.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;//se pone static para poder utilizar todos los metodos de assert de forma directa

public class CalculadoraTest {
    @Test
    public void probarSuma(){
        Calculadora calc = new Calculadora();

        assertEquals(10.0, calc.sumar(5, 5), 0.001);

    }
    @Test
    public void probarResta(){
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.restar(6, 3), 0.001);
    }
    @Test
    public void probarMultiplicacion(){
        Calculadora calc = new Calculadora();
        assertEquals(22, calc.multiplicar(2, 11), 0.001);
    }
    @Test
    public void ProbarDivision(){
        Calculadora calc = new Calculadora();
        assertEquals(22, calc.dividir(44, 2), 0.001);
        assertEquals(-1, calc.dividir(44, 0), 0.001);
        assertEquals(0, calc.dividir(0, 2), 0.001);
    }
}
