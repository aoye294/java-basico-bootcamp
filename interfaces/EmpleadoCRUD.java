package interfaces;

import java.util.*;

public class EmpleadoCRUD implements InterfaceCRUD{
    
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> read() {
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {
        empleados.remove(empleado);
    }

}
