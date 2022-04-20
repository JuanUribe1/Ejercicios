public class Empleado {
    private String Nombre, Id;
    private double sueldo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String id, double sueldo) {
        Nombre = nombre;
        Id = id;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
}
