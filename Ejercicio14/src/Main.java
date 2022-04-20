import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una base");
        int num = Integer.parseInt(sc.next());
        int contador=0;
        int resultado=1;
        System.out.println("Ingrese potencia (N)");
        int N = Integer.parseInt(sc.next());
        while(contador!=N){
            resultado = resultado*num;
            contador++;
        }
        System.out.println("resultado: "+resultado);
    }
}