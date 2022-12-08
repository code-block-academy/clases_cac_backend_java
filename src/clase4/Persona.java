package clase4;

import java.time.LocalDate;

public abstract class Persona {
    /* Propiedades */
    private String name;
    private final String apellido;
    private final LocalDate fechaNacimiento;
    private Direccion direccion;

    /* Constructores */
    public Persona(String name, String apellido, LocalDate fechaNacimiento, Direccion direccion) {
        this.name = name;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    /* Metodos */
    public abstract String description();

    /* Getters y Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
