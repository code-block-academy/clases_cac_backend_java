package clase4;

import java.time.LocalDate;

public class Usuario extends Persona{
    /* Propiedades */
    private String userName;
    private String correo;
    private String password;
    private final LocalDate registro;
    private final int id;
    private static int Auto_Increment = 1;

    /* Constructor */
    public Usuario(String name, String apellido, LocalDate fechaNacimiento, Direccion direccion, String userName, String correo, String password) {
        super(name, apellido, fechaNacimiento, direccion);
        this.userName = userName;
        this.correo = correo;
        this.password = password;
        this.registro = LocalDate.now();
        this.id = Auto_Increment;
        Auto_Increment++;
    }

    /* Metodos */
    @Override
    public String description() {
        return "Hola Soy un usuario, mi nombre es: " + this.getUserName() + ", me registre en la fecha: " + this.getRegistro();
    }

    /* Getters y Setters */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistro() {
        return registro;
    }

    public int getId() {
        return id;
    }
}
