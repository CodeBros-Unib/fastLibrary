package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;

public class BookDao {
    
    private Connection connection;
    public static int id;
    
    public BookDao() {
        this.connection = new connection().getConnection();
    }
    
    public Book consultaBook(int id) {
        Book book = new Book();
        try {
            String sql;
            sql = "SELECT idlivro, titulo, status FROM livro where idlivro = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                book.setId(rs.getInt("idlivro"));
                book.setTitulo(rs.getString("titulo"));
                book.setStatus(rs.getString("status"));
            }

            rs.close();
        } catch (SQLException exception) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, exception);
        }
        
        return book;
    }
}
