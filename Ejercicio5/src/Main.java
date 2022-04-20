import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de la tabla que desea");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=1;j<=10; j++){
            System.out.println(num+" x "+j+" = "+num*j);
        }
    }
}