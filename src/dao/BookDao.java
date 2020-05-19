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
import model.Book;
import model.User;

public class BookDao {

    private Connection connection;
    public static int id;
    
    

    public BookDao() {

        this.connection = new connection().getConnection();
    }
    Book BookDao = new Book();

    public void cadastroLivro(Book objBook) {
        try {
            String sql;
            sql = "INSERT INTO livro(idlivro, titulo, nome_do_autor, editora, ano) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, objBook.getId());
            stmt.setString(2, objBook.getTitulo());
            stmt.setString(3, objBook.getAutor());
            stmt.setString(4, objBook.getEditora());
            stmt.setInt(5, objBook.getAno());

            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Book consultaBook() {
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
    
    public void alteraStatus() {
        try {
            String sql;
            sql = "UPDATE livro SET status = 'Emprestado' WHERE idlivro = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException exception) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public void devolucaoLivro() {
        try {
            String sql;
            sql = "UPDATE livro SET status = default WHERE idlivro = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    public List<Book> listarLivros() {
        List<Book> Books = new ArrayList<>();

        try {
            String sql;
            sql = "SELECT * FROM livro";
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(Integer.parseInt(rs.getString("Codigo")));
                book.setTitulo(rs.getString("Titulo"));
                book.setAutor(rs.getString("Autor"));
                book.setEditora(rs.getString("Editora"));
                book.setAno(Integer.parseInt(rs.getString("Ano")));
                Books.add(book);
            }

            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, exception);
        }

        return Books;
    }
}
