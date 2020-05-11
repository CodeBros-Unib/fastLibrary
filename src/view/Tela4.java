package view;

import dao.UserDao;
import model.User;

public class Tela4 extends javax.swing.JFrame {

    private UserDao objDao;
    private User objUser;
    
    public Tela4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        lblCodigo2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCpf2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 460, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaa3.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(540, 290, 160, 150);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(106, 173, 198));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar);
        btnCadastrar.setBounds(250, 170, 160, 30);

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(34, 34, 34));
        lblCodigo2.setText("CPF:");
        jPanel2.add(lblCodigo2);
        lblCodigo2.setBounds(20, 20, 170, 17);
        jPanel2.add(txtCpf);
        txtCpf.setBounds(20, 40, 180, 30);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(34, 34, 34));
        lblTitulo.setText("Nome Completo:");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(220, 20, 310, 17);
        jPanel2.add(txtNome);
        txtNome.setBounds(220, 40, 400, 30);

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(34, 34, 34));
        lblStatus.setText("Endereço:");
        jPanel2.add(lblStatus);
        lblStatus.setBounds(310, 90, 120, 17);
        jPanel2.add(txtEndereco);
        txtEndereco.setBounds(310, 110, 310, 30);
        jPanel2.add(txtSexo);
        txtSexo.setBounds(210, 110, 80, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(34, 34, 34));
        lblNome.setText("Sexo:");
        jPanel2.add(lblNome);
        lblNome.setBounds(210, 90, 70, 17);

        lblCpf2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpf2.setForeground(new java.awt.Color(34, 34, 34));
        lblCpf2.setText("Idade:");
        jPanel2.add(lblCpf2);
        lblCpf2.setBounds(20, 90, 150, 17);
        jPanel2.add(txtIdade);
        txtIdade.setBounds(20, 110, 170, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 170, 640, 220);

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
        jLabel7.setText("Cadastro de Usuário");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 110, 700, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 440);

        setSize(new java.awt.Dimension(700, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        objUser = new User();
        objUser.setCpf(txtCpf.getText());
        objUser.setNome(txtNome.getText());
        objUser.setIdade(txtIdade.getText());
        objUser.setEndereco(txtEndereco.getText());
        
        objDao = new UserDao();
        objDao.cadastraUser(objUser);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        Tela2 Tela2 = new Tela2();
        Tela2.setVisible (true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
