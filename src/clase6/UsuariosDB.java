package clase6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDB {
    private Connection mysql;
    private final String cID = "id_usuarios";
    private final String cNombre = "nombre";
    private final String cApellido = "apellido";
    private final String cEmail = "email";
    private final String cPassword = "password";
    private final String findbyemail = "SELECT * FROM " + Databases.usuarios + " WHERE "+ cEmail +" = ?";
    private final String findbyid = "SELECT * FROM " + Databases.usuarios + " WHERE " + cID + " = ?";


    public UsuariosDB() {
        try {
            mysql = new Mysql(Databases.usuarios).getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Usuario findByEmail(String email) throws SQLException {
        PreparedStatement hoja = mysql.prepareStatement(findbyemail);
        hoja.setString(1, email);
        ResultSet data = hoja.executeQuery();
        Usuario user = null;
        while (data.next()){
            user = new Usuario(data.getInt(cID), data.getString(cNombre), data.getString(cApellido),
                    data.getString(cEmail), data.getString(cPassword));
        }
        return user;
    }

    public Usuario findByID(int id) throws SQLException {
        PreparedStatement hoja = mysql.prepareStatement(findbyid);
        hoja.setInt(1, id);
        ResultSet data = hoja.executeQuery();
        Usuario user = null;
        while (data.next()){
            user = new Usuario(data.getInt(cID), data.getString(cNombre), data.getString(cApellido),
                    data.getString(cEmail), data.getString(cPassword));
        }
        return user;
    }
}
