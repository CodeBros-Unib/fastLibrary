package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    public Connection getConnetion() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
