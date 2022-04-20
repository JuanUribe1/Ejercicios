import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alum = new Alumno();
        alum.setMAT(Integer.parseInt(sc.next()));
        alum.setCAL1(Double.parseDouble(sc.next()));
        alum.setCAL2(Double.parseDouble(sc.next()));
        alum.setCAL3(Double.parseDouble(sc.next()));
        alum.setCAL4(Double.parseDouble(sc.next()));
        alum.setCAL5(Double.parseDouble(sc.next()));
        double prom = calcularProm(alum);
        System.out.println("Matricula: "+alum.getMAT());
        System.out.println("Promedio: "+prom);
        System.out.println(calcularAprovado(prom));
    }
    public static String calcularAprovado(double prom){
        if(prom>=6){
            return "aprobado";
        }else{
            return "no aprobado";
        }
    }
    public static double calcularProm(Alumno alum){
        return (alum.getCAL1() + alum.getCAL2() + alum.getCAL3() + alum.getCAL4() + alum.getCAL5())/5;
    }
}