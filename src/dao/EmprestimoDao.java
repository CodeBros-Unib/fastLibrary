package dao;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public void emprestaLivro(Emprestimo objEmp) {
        
        try {
            String sql;
            sql = "INSERT INTO emprestimo (CPF, idlivro, data_emprestimo, data_devolucao) values (?, ?, now(), now())";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, objEmp.getCpfSolictante());
            stmt.setInt(2, objEmp.getIdLivro());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}
