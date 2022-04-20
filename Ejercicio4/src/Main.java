import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SUE;
        SUE = Double.parseDouble(sc.next());
        if(SUE<1000){
            SUE += SUE*0.15;
        }else{
            SUE += SUE*0.12;
        }
        System.out.println(SUE);
    }
}