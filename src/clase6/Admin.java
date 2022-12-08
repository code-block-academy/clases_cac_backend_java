package clase6;

import javax.swing.*;
import java.sql.SQLException;

public class Admin extends Usuario implements Administradores {
    private UsuariosDB manejoDB;

    public Admin(int id, String nombre, String apellido, String email, String password) {
        super(id, nombre, apellido, email, password);
        manejoDB = new UsuariosDB();
    }

    @Override
    public void bannearUser(int id, BadModals tiempo) {
        Usuario user = null;
        try {
            user = manejoDB.findByID(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String passUser = JOptionPane.showInputDialog("ingrese contrasña");
        if (passUser.equals(claveExtra)) {
            if (user != null) {
                System.out.print("el usuario " + user.getNombre() + "con email: " + user.getEmail() + " ");
                System.out.println("fue baneado por " + tiempo.getTiempo());
            } else {
                System.out.println("no se encontro al usuario");
            }
        } else {
            System.out.println("no eres admin");
        }
    }

    @Override
    public void permaBan(int id) {
        Usuario user = null;
        try {
            user = manejoDB.findByID(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String passUser = JOptionPane.showInputDialog("ingrese contrasña");
        if (passUser.equals(claveExtra)) {
            if (user != null) {
                System.out.print("el usuario " + user.getNombre() + "con email: " + user.getEmail() + " ");
                System.out.println("fue baneado por indefinidamente");
            } else {
                System.out.println("no se encontro al usuario");
            }
        } else {
            System.out.println("bad");
        }
    }
}
