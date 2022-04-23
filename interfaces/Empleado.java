package interfaces;

public class Empleado {
    String nombre;
    int edad;
    double salario;
    boolean alta;

    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }
    public String toString(){
        return "\nEmpleados: \n"+
        "Nombre: " + this.nombre + "\n" +
        "Edad: " + this.edad + "\n" +
        "Salario: " + this.salario + "\n" +
        "Alta: " + this.alta + "\n";
    }
}
