package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import model.Emprestimo;
import model.User;

public class EmprestimoDao {

    private Connection connection;

    public EmprestimoDao() {
        this.connection = new connection().getConnection();
    }
}
