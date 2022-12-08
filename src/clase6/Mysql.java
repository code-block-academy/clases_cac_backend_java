package clase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    private final Databases database;

    public Mysql(Databases database) {
        this.database = database;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ database, "root", "1234");
    }
}
