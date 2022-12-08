package clase5;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String urlDB = "jdbc:mysql://localhost:3306/usuarios";
        String userDB = "root";
        String passwordDB = "1234";
        String consultaSelect = "SELECT * FROM usuarios LIMIT 10";
        String consultaSelect2 = "SELECT * FROM usuarios WHERE id_usuarios = 1";
        String consultaUpdate = "update usuarios set email = \"nuevo@a.com\" where id_usuarios = 1";
        String queryPreparada = "SELECT * FROM usuarios WHERE id_usuarios = ? AND nombre = ?";
        String campoNombre = "nombre";
        String campoApellido = "apellido";
        String campoEmail = "email";
        String campoID = "id_usuarios";
        try {
            //conexion con la base datos
            Connection mysql = DriverManager.getConnection(urlDB, userDB, passwordDB);

            //Crear hoja virtual u objeto de tipo Statement
            Statement hojaConsulta = mysql.createStatement();
            // Consultas preparadas
            PreparedStatement consultaPreparada = mysql.prepareStatement(queryPreparada);

            //Consultas
            ResultSet resultadoConsulta = hojaConsulta.executeQuery(consultaSelect);

            //Mostrar datos
            // resultadoConsulta.next() => nos dice si podemos seguir leyendo informacion
            while (resultadoConsulta.next()){
                System.out.print("ID: " + resultadoConsulta.getInt(campoID) + " ");
                System.out.print(resultadoConsulta.getString(campoNombre) + " ");
                System.out.print(resultadoConsulta.getString(campoApellido) + " ");
                System.out.println(resultadoConsulta.getString(campoEmail));
            }

            resultadoConsulta = hojaConsulta.executeQuery(consultaSelect2);

            //Mostrar datos
            // resultadoConsulta.next() => nos dice si podemos seguir leyendo informacion
            while (resultadoConsulta.next()){
                System.out.print("ID: " + resultadoConsulta.getInt(campoID) + " ");
                System.out.print(resultadoConsulta.getString(campoNombre) + " ");
                System.out.print(resultadoConsulta.getString(campoApellido) + " ");
                System.out.println(resultadoConsulta.getString(campoEmail));
            }

            // executeUpdate => consultas para update, insert, delete
            hojaConsulta.executeUpdate(consultaUpdate);

            resultadoConsulta = hojaConsulta.executeQuery(consultaSelect2);

            //Mostrar datos
            // resultadoConsulta.next() => nos dice si podemos seguir leyendo informacion
            while (resultadoConsulta.next()){
                System.out.print("ID: " + resultadoConsulta.getInt(campoID) + " ");
                System.out.print(resultadoConsulta.getString(campoNombre) + " ");
                System.out.print(resultadoConsulta.getString(campoApellido) + " ");
                System.out.println(resultadoConsulta.getString(campoEmail));
            }

            //consulta preparada
            consultaPreparada.setInt(1, 1);
            consultaPreparada.setString(2, "jada");
            //ejecutamos la consulta preparada
            resultadoConsulta = consultaPreparada.executeQuery();

            //Mostrar datos
            // resultadoConsulta.next() => nos dice si podemos seguir leyendo informacion
            System.out.println("Consulta preparada");
            while (resultadoConsulta.next()){
                System.out.print("ID: " + resultadoConsulta.getInt(campoID) + " ");
                System.out.print(resultadoConsulta.getString(campoNombre) + " ");
                System.out.print(resultadoConsulta.getString(campoApellido) + " ");
                System.out.println(resultadoConsulta.getString(campoEmail));
            }

            //consulta preparada
            consultaPreparada.setInt(1, 5);
            consultaPreparada.setString(2, "Perry");
            //ejecutamos la consulta preparada
            resultadoConsulta = consultaPreparada.executeQuery();

            //Mostrar datos
            // resultadoConsulta.next() => nos dice si podemos seguir leyendo informacion
            System.out.println("Consulta preparada 2");
            while (resultadoConsulta.next()){
                System.out.print("ID: " + resultadoConsulta.getInt(campoID) + " ");
                System.out.print(resultadoConsulta.getString(campoNombre) + " ");
                System.out.print(resultadoConsulta.getString(campoApellido) + " ");
                System.out.println(resultadoConsulta.getString(campoEmail));
            }

        }catch (SQLException error){
            System.out.println("Error!");
            error.printStackTrace();
        }
        System.out.println("No problem!");
    }
}
