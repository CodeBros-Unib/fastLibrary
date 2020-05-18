/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BookDao;
import dao.EmprestimoDao;
import dao.UserDao;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Book;
import model.Emprestimo;
import model.User;

/**
 *
 * @author rosan
 */
public class Tela3 extends javax.swing.JFrame {

    private EmprestimoDao objEmpDao;
    private UserDao objUserDao;
    private BookDao objBookDao;
    private Emprestimo objEmprestimo;
    private User objUser;
    private Book objBook;

    public Tela3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnEmprestar = new javax.swing.JButton();
        lblCodigo2 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCpf2 = new javax.swing.JLabel();
        txtCpf2 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaa3.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 370, 160, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 460, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(txtCodigo);
        txtCodigo.setBounds(100, 40, 210, 30);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(34, 34, 34));
        lblCodigo.setText("Código do Livro:");
        jPanel2.add(lblCodigo);
        lblCodigo.setBounds(100, 20, 180, 17);

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(34, 34, 34));
        lblCpf.setText("CPF do solicitante:");
        jPanel2.add(lblCpf);
        lblCpf.setBounds(350, 20, 180, 17);
        jPanel2.add(txtCpf);
        txtCpf.setBounds(350, 40, 210, 30);

        jSeparator1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(100, 130, 460, 10);

        btnEmprestar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnEmprestar.setForeground(new java.awt.Color(106, 173, 198));
        btnEmprestar.setText("EMPRESTAR");
        btnEmprestar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        btnEmprestar.setContentAreaFilled(false);
        btnEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmprestar);
        btnEmprestar.setBounds(250, 280, 160, 30);

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(34, 34, 34));
        lblCodigo2.setText("Código do Livro:");
        jPanel2.add(lblCodigo2);
        lblCodigo2.setBounds(20, 140, 130, 17);
        jPanel2.add(txtCodigo2);
        txtCodigo2.setBounds(20, 160, 140, 30);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(34, 34, 34));
        lblTitulo.setText("Título:");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(180, 140, 180, 17);
        jPanel2.add(txtTitulo);
        txtTitulo.setBounds(180, 160, 270, 30);

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(34, 34, 34));
        lblStatus.setText("Status:");
        jPanel2.add(lblStatus);
        lblStatus.setBounds(470, 140, 120, 17);
        jPanel2.add(txtStatus);
        txtStatus.setBounds(470, 160, 150, 30);
        jPanel2.add(txtNome2);
        txtNome2.setBounds(210, 230, 330, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(34, 34, 34));
        lblNome.setText("Nome:");
        jPanel2.add(lblNome);
        lblNome.setBounds(210, 210, 70, 17);

        lblCpf2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpf2.setForeground(new java.awt.Color(34, 34, 34));
        lblCpf2.setText("CPF do Solicitante:");
        jPanel2.add(lblCpf2);
        lblCpf2.setBounds(20, 210, 150, 17);
        jPanel2.add(txtCpf2);
        txtCpf2.setBounds(20, 230, 170, 30);

        btnBuscar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(106, 173, 198));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(250, 90, 160, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 170, 640, 320);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(106, 173, 198));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(570, 20, 110, 60);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Empréstimo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 110, 700, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 520);

        setSize(new java.awt.Dimension(700, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        Tela2 Tela2 = new Tela2();
        Tela2.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestarActionPerformed
        if (!txtStatus.equals("Disponível")) {
            JOptionPane.showMessageDialog(null, "O livro já está emprestado");
            this.dispose();
            new Tela2().setVisible(true);
        } else {
            LocalDate hoje = LocalDate.now();    
            LocalDate devolucao = hoje.plusDays(10);
            objEmprestimo = new Emprestimo();
            objEmprestimo.setCpfSolictante(txtCpf2.getText());
            objEmprestimo.setIdLivro(Integer.parseInt(txtCodigo2.getText()));
            objEmprestimo.setDataEmprestimo(hoje);
            objEmprestimo.setDataDevolucao(devolucao);
                    
            objEmpDao = new EmprestimoDao();
            objEmpDao.emprestaLivro(objEmprestimo);

            dao.BookDao.id = Integer.parseInt(txtCodigo2.getText());
            objBookDao = new BookDao();
            objBookDao.alteraStatus();

            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso, a data de devolução é: " + devolucao + "");
            this.dispose();
            new Tela2().setVisible(true);
        }
    }//GEN-LAST:event_btnEmprestarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objUserDao = new UserDao();
        objBookDao = new BookDao();

        dao.UserDao.cpf = txtCpf.getText();
        objUser = objUserDao.consultaUser();
        txtCpf2.setText(objUser.getCpf());
        txtNome2.setText(objUser.getNome());

        dao.BookDao.id = Integer.parseInt(txtCodigo.getText());
        objBook = objBookDao.consultaBook();
        txtCodigo2.setText(String.valueOf(objBook.getId()));
        txtTitulo.setText(objBook.getTitulo());
        txtStatus.setText(objBook.getStatus());
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpf2;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
