/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author rosan
 */
public class Tela2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Tela2() {
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
        jLabel1 = new javax.swing.JLabel();
        emprestimo = new javax.swing.JButton();
        cadlivro = new javax.swing.JButton();
        caduser = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fast Library");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 10, 170, 30);

        emprestimo.setBackground(new java.awt.Color(7, 32, 160));
        emprestimo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        emprestimo.setForeground(new java.awt.Color(255, 255, 255));
        emprestimo.setText("EMPRÉSTIMO DE UM LIVRO");
        emprestimo.setBorderPainted(false);
        emprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimoActionPerformed(evt);
            }
        });
        jPanel1.add(emprestimo);
        emprestimo.setBounds(210, 130, 250, 40);

        cadlivro.setBackground(new java.awt.Color(7, 32, 160));
        cadlivro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        cadlivro.setForeground(new java.awt.Color(255, 255, 255));
        cadlivro.setText("CADASTRAR LIVRO");
        cadlivro.setBorderPainted(false);
        cadlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadlivroActionPerformed(evt);
            }
        });
        jPanel1.add(cadlivro);
        cadlivro.setBounds(210, 180, 250, 40);

        caduser.setBackground(new java.awt.Color(7, 32, 160));
        caduser.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        caduser.setForeground(new java.awt.Color(255, 255, 255));
        caduser.setText("CADASTRAR USUÁRIO");
        caduser.setBorderPainted(false);
        jPanel1.add(caduser);
        caduser.setBounds(210, 230, 250, 40);

        btnSair.setBackground(new java.awt.Color(7, 32, 160));
        btnSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(220, 370, 80, 40);

        btnVoltar.setBackground(new java.awt.Color(7, 32, 160));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(380, 370, 80, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuu.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 160, 670, 350);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("O que você deseja fazer?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 72, 670, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 510);

        setSize(new java.awt.Dimension(672, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadlivroActionPerformed

    }//GEN-LAST:event_cadlivroActionPerformed

    private void emprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimoActionPerformed

    }//GEN-LAST:event_emprestimoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       this.dispose();
        Tela1 Tela1 = new Tela1();
        Tela1.setVisible (true);
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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton cadlivro;
    private javax.swing.JButton caduser;
    private javax.swing.JButton emprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
