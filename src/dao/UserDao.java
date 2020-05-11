package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.User;

public class UserDao {
    private Connection connection;
    
    public UserDao() {
        this.connection = new connection().getConnection();
    }
    
    User user = new User();
    
    public void cadastraUser(User objUser) {
        try {
            String sql;
            sql = "INSERT INTO usuario(CPF, nome, idade, endereço, sexo) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, objUser.getCpf());
            stmt.setString(2, objUser.getNome());
            stmt.setString(3, objUser.getEndereco());
            stmt.setString(4, objUser.getSexo());
            stmt.setString(5, objUser.getIdade());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado");
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    } 
}
