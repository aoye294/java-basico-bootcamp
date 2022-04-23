package interfaces;

import java.util.List;

public interface InterfaceCRUD {

    void save(Empleado empleado);
    List<Empleado> read();
    void delete(Empleado empleado);
    
}
