package dao;

import database.connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Emprestimo;

public class EmprestimoDao {

    private Connection connection;
    public static int id;
    public static String cpf;
    public static int idLivro;

    public EmprestimoDao() {
        this.connection = new connection().getConnection();
    }

    public void emprestaLivro(Emprestimo objEmp) {

        try {
            String sql;
            sql = "INSERT INTO emprestimo (CPF, idlivro, data_emprestimo, data_devolucao, status) values (?, ?, ?, ?, 'Emprestado')";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, objEmp.getCpfSolicitante());
            stmt.setInt(2, objEmp.getIdLivro());
            stmt.setDate(3, Date.valueOf(objEmp.getDataEmprestimo()));
            stmt.setDate(4, Date.valueOf(objEmp.getDataDevolucao()));

            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }

    public List<Emprestimo> listarEmprestimo() {
        List<Emprestimo> emprestimos = new ArrayList<>();

        try {
            String sql;
            sql = "SELECT u.nome, u.CPF, l.idlivro, l.titulo, e.status, e.data_emprestimo, e.data_devolucao "
                    + "FROM emprestimo AS e "
                    + "JOIN usuario AS u ON e.CPF = u.CPF "
                    + "JOIN livro AS l ON e.idlivro = l.idlivro";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.setIdLivro(rs.getInt("idlivro"));
                emprestimo.setTitulo(rs.getString("titulo"));
                emprestimo.setCpfSolicitante(rs.getString("CPF"));
                emprestimo.setSolicitante(rs.getString("nome"));
                emprestimo.setDataEmprestimo(rs.getDate("data_emprestimo").toLocalDate());
                emprestimo.setDataDevolucao(rs.getDate("data_devolucao").toLocalDate());
                emprestimo.setStatus(rs.getString("status"));
                emprestimos.add(emprestimo);
            }

            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, exception);
        }

        return emprestimos;
    }

    public Emprestimo getEmprestimo() {

        Emprestimo emprestimo = new Emprestimo();
        
        try {
            String sql;
            sql = "SELECT idemprestimo FROM emprestimo WHERE CPF = ? AND idlivro = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.setInt(2, idLivro);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                emprestimo.setIdEmprestimo(rs.getInt("idemprestimo"));
            }
            
            rs.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return emprestimo;
    }

    public void devolucao() {
        try {
            String sql;
            sql = "UPDATE emprestimo SET status = 'Devolvido' where idemprestimo = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
        } catch (SQLException exception) {
            Logger.getLogger(EmprestimoDao.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}
