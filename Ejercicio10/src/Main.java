import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese total a pagar");
        double totalPagar = sc.nextDouble();
        if(totalPagar >= 0 && totalPagar <= 500){

        } else if (totalPagar >= 501 && totalPagar <= 1000) {
            totalPagar -= totalPagar*0.05;
        } else if (totalPagar >= 1001 && totalPagar <= 7000) {
            totalPagar -= totalPagar*0.11;
        } else if (totalPagar >= 7001 && totalPagar <= 15000) {
            totalPagar -= totalPagar*0.18;
        } else if (totalPagar >= 15001) {
            totalPagar -= totalPagar*0.25;
        }
        System.out.println("Total a pagar: "+totalPagar);
    }
}