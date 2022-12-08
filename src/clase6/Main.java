package clase6;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        UsuariosDB manejoDB = new UsuariosDB();
        Usuario jada = null;
        try{
            jada = manejoDB.findByEmail("ac.mattis.velit@dolortempusnon.co.uk");
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(jada.getEmail());
*/

        Admin root = new Admin(1, "marco", "avila", "asd", "1234");
        root.bannearUser(26, BadModals.GRAVE);
        root.permaBan(3);

        //Enums
        /*
        Meses primero = Meses.ENERO;
        //System.out.println(primero.toString().toLowerCase());
        //int a = primero.getNumero();
        String mes = JOptionPane.showInputDialog("ingrese mes");
        Meses w = Enum.valueOf( Meses.class, mes.toUpperCase());
        System.out.println(w);
        */

    }
}
