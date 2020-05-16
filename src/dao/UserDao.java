package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserDao {

    private Connection connection;
    public static String cpf = "";

    public UserDao() {
        this.connection = new connection().getConnection();
    }

    public void cadastraUser(User objUser) {
        try {
            String sql;
            sql = "INSERT INTO usuario(CPF, nome, idade, endereço, sexo) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, objUser.getCpf());
            stmt.setString(2, objUser.getNome());
            stmt.setInt(3, objUser.getIdade());
            stmt.setString(4, objUser.getEndereco());
            stmt.setString(5, objUser.getSexo());

            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<User> listarUser() {
        List<User> users = new ArrayList<>();

        try {
            String sql;
            sql = "SELECT * FROM usuario";
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setCpf(rs.getString("CPF"));
                user.setNome(rs.getString("nome"));
                user.setIdade(rs.getInt("idade"));
                user.setEndereco(rs.getString("endereço"));
                user.setSexo(rs.getString("sexo"));
                users.add(user);
            }

            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, exception);
        }

        return users;
    }

    public User consultaUser() {
        User user = new User();
        try {
            String sql;
            sql = "SELECT CPF, nome FROM usuario where CPF = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user.setCpf(rs.getString("CPF"));
                user.setNome(rs.getString("nome"));
            }
            rs.close();
        } catch (SQLException exception) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, exception);
        }
        return user;
    }
}
