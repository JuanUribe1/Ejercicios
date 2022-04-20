import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, mayor=0, menor=0;
        System.out.println("Ingrese la cantidad de numeros");
        N = Integer.parseInt(sc.next());
        System.out.println("Ingrese los numeros");
        for(int i=0; i<N; i++){
            int numero = sc.nextInt();
            if(i==0){
                mayor=numero;
                menor=numero;
            }else{
                if(numero>mayor){
                    mayor = numero;
                }
                if(numero<menor){
                    menor = numero;
                }
            }
        }
        System.out.println("Mayor: "+mayor+
                "\nMenor: "+menor);
    }
}