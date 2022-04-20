import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una base");
        int num = Integer.parseInt(sc.next());
        int resultado=1;
        System.out.println("Ingrese potencia (N)");
        int N = Integer.parseInt(sc.next());
        for (int i = 1; i <= N; i++) {
            resultado = resultado*num;
        }
        System.out.println("resultado: "+resultado);
    }
}