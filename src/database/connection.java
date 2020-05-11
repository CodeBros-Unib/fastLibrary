package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    public Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/CodeBros";
        String user = "root";
        String password = "admin";
        
        try {
            System.setProperty(driver, "");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
