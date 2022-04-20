import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boleto[] boletos = new Boleto[5];
        for (int i = 0; i < 5; i++) {
            boletos[i]= new Boleto();
            System.out.println("Ingrese precio boleto "+(i+1));
            boletos[i].setPrecio(Double.parseDouble(sc.next()));
            System.out.println("Ingrese la cantidad de boletos "+(i+1)+" vendidos");
            boletos[i].setCantidadVendida(Integer.parseInt(sc.next()));
            boletos[i].calcularPrecioCompra();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("El boleto "+(i+1)+" vendio "+boletos[i].getCantidadVendida()+" con un precio de compra de "+boletos[i].getPrecioCompra());
        }
    }
}