package clase4;

import java.time.LocalDate;

public class Docente extends Persona{
    public Docente(String name, String apellido, LocalDate fechaNacimiento, Direccion direccion) {
        super(name, apellido, fechaNacimiento, direccion);
    }

    @Override
    public String description() {
        return null;
    }
}
