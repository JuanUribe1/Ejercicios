import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switche = 1;
        int contador = 1; //contador para nombrar los empleados
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        while(switche==1){
            System.out.println("ingrese sueldo del empleado");
            empleados.add(new Empleado("Empleado"+contador, ""+contador, Double.parseDouble(sc.next())));

            System.out.println("1. Si desea ingresar otro empleado\n2. Finalizar");
            switche = Integer.parseInt(sc.next());
        }
        CalcularNominaEmpleado(empleados);
        ImprimirSueldos(empleados);
    }
    public static void CalcularNominaEmpleado(ArrayList<Empleado> emps){
        for(int i=0; i<emps.size(); i++){
            if(emps.get(i).getSueldo()<1000000){
                emps.get(i).setSueldo(emps.get(i).getSueldo()+emps.get(i).getSueldo()*0.15);
            }else{
                emps.get(i).setSueldo(emps.get(i).getSueldo()+emps.get(i).getSueldo()*0.12);
            }
        }
    }
    public static void ImprimirSueldos(ArrayList<Empleado> emps){
        for(int i=0; i<emps.size(); i++){
            System.out.println(emps.get(i).getSueldo());
        }
    }
}