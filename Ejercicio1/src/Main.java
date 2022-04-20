import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sumPares=0, sumImpares=0;
        int contPares=0;
        for(int i=0; i<270; i++){
            num = Integer.parseInt(sc.next().substring(3));
            if(num>=1 && num<=270) {
                if (num % 2 == 0) {
                    sumPares += num;
                    contPares++;
                } else {
                    sumImpares += num;
                }
            }else{
                i--;
            }
        }
    }
}