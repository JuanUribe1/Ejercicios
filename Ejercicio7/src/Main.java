import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma=0, num=0;
        Stack<Double> pila = new Stack<Double>();
        for(int i=0; i<20; i++){
            num = Double.parseDouble(sc.next());
            pila.push(num);
            suma+=num;
        }
        System.out.println("promedio general: "+suma/20);
        for(int i=0; i<20; i++){
            System.out.println(pila.pop());
        }
    }
}