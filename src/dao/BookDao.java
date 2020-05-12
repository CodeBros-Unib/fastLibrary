package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Book;

public class BookDao {

    private final Connection connection;
    public BookDao(){
        
  this.connection = new connection().getConnection();
    }
  Book BookDao = new Book();
    public void cadastroLivro (Book objBook){
        try {
            String sql;
            sql = "INSERT INTO livro(idlivo, titulo, nome_do_autor, editora, ano) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, objBook.getidlivro());
            stmt.setString(2, objBook.getNomeLivro());
            stmt.setString(3, objBook.getAutor());
            stmt.setString(4, objBook.getEditora());
            stmt.setString(5, objBook.getAno());

            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    
    
    }

