import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, mayor=0;
        System.out.println("Ingrese cantidad de trabajadores");
        N = Integer.parseInt(sc.next());
        System.out.println("Ingrese los sueldos");
        for(int i=0; i<N; i++){
            int sueldo = sc.nextInt();
            if(i==0){
                mayor=sueldo;
            }else{
                if(sueldo>mayor){
                    mayor = sueldo;
                }
            }
        }
        System.out.println("El sueldo mayor es: "+mayor);
    }
}