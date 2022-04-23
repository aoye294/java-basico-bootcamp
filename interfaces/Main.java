package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        
        Empleado juanito = new Empleado("Juanito",21,450.000,true);
        Empleado miguel = new Empleado("Miguel",36,70.000,false);
        Empleado felipe = new Empleado("Felipe",25,10.000,true);

        empleadoCRUD.save(juanito);
        empleadoCRUD.save(miguel);
        empleadoCRUD.save(felipe);

        List<Empleado> empleados = empleadoCRUD.read();
        
        empleadoCRUD.delete(juanito);
        
        System.out.println(empleados);
    }
}
