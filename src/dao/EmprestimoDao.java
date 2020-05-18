package dao;

import database.connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
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
            sql = "INSERT INTO emprestimo (CPF, idlivro, data_emprestimo, data_devolucao) values (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, objEmp.getCpfSolictante());
            stmt.setInt(2, objEmp.getIdLivro());
            stmt.setDate(3, Date.valueOf(objEmp.getDataEmprestimo()));
            stmt.setDate(4, Date.valueOf(objEmp.getDataDevolucao()));
            
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}
