package view;

import dao.EmprestimoDao;
import dao.UserDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tela2 extends javax.swing.JFrame {

    public Tela2() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tableUser.getModel();
        tableUser.setRowSorter(new TableRowSorter(modelo));
        tableEmprestimos.setRowSorter(new TableRowSorter(modelo));
        listarUser();
        listarEmprestimo();
    }
    
    public void listarUser() {
        DefaultTableModel modelo = (DefaultTableModel) tableUser.getModel();
        modelo.setNumRows(0);
        UserDao userDao = new UserDao();
        
        userDao.listarUser().stream().forEach((user) -> {
            modelo.addRow(new Object[]{
                user.getCpf(),
                user.getNome(),
                user.getIdade(),
                user.getSexo(),
                user.getEndereco()
            });
        });
    }
    
    public void listarEmprestimo() {
        DefaultTableModel modelo = (DefaultTableModel) tableEmprestimos.getModel();
        modelo.setNumRows(0);
        EmprestimoDao emprestimoDao = new EmprestimoDao();
        
        emprestimoDao.listarEmprestimo().stream().forEach((emprestimo) -> {
            modelo.addRow(new Object[] {
               emprestimo.getIdLivro(),
               emprestimo.getTitulo(),
               emprestimo.getCpfSolicitante(),
               emprestimo.getSolicitante(),
               emprestimo.getDataEmprestimo(),
               emprestimo.getDataDevolucao(),
               emprestimo.getStatus()
            });
        });
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
        cadUser = new javax.swing.JButton();
        devolveLivro = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEmprestimos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(249, 214, 96));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));

        emprestimo.setBackground(new java.awt.Color(255, 255, 255));
        emprestimo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        emprestimo.setForeground(new java.awt.Color(106, 173, 198));
        emprestimo.setText("EMPRÉSTIMO DE UM LIVRO");
        emprestimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        emprestimo.setFocusPainted(false);
        emprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimoActionPerformed(evt);
            }
        });

        cadlivro.setBackground(new java.awt.Color(255, 255, 255));
        cadlivro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        cadlivro.setForeground(new java.awt.Color(106, 173, 198));
        cadlivro.setText("CADASTRAR LIVRO");
        cadlivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        cadlivro.setFocusPainted(false);
        cadlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadlivroActionPerformed(evt);
            }
        });

        cadUser.setBackground(new java.awt.Color(255, 255, 255));
        cadUser.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        cadUser.setForeground(new java.awt.Color(106, 173, 198));
        cadUser.setText("CADASTRAR USUÁRIO");
        cadUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        cadUser.setFocusPainted(false);
        cadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserActionPerformed(evt);
            }
        });

        devolveLivro.setBackground(new java.awt.Color(255, 255, 255));
        devolveLivro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        devolveLivro.setForeground(new java.awt.Color(106, 173, 198));
        devolveLivro.setText("DEVOLVER LIVRO");
        devolveLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        devolveLivro.setFocusPainted(false);
        devolveLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolveLivroActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSair.setForeground(new java.awt.Color(106, 173, 198));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png")));
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(106, 173, 198), 2));
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "Editora", "Ano", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLivros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Livros", jPanel2);

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Idade", "Endereço", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setResizable(false);
            tableUser.getColumnModel().getColumn(1).setResizable(false);
            tableUser.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableUser.getColumnModel().getColumn(2).setResizable(false);
            tableUser.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableUser.getColumnModel().getColumn(3).setResizable(false);
            tableUser.getColumnModel().getColumn(4).setResizable(false);
            tableUser.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Usuários", jPanel3);

        tableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Livro", "Título", "CPF", "Solicitante", "Data Empréstimo", "Data Devolução", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableEmprestimos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Empréstimos", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(590, 590, 590)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cadlivro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(devolveLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadlivro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(devolveLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 700);

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadlivroActionPerformed
        Tela5 Tela5 = new Tela5();
        Tela5.setVisible (true);
    }//GEN-LAST:event_cadlivroActionPerformed

    private void emprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimoActionPerformed
        this.dispose();
        new Tela3().setVisible(true);
    }//GEN-LAST:event_emprestimoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        new Tela1().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void cadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserActionPerformed
        this.dispose();
        new Tela4().setVisible(true);
    }//GEN-LAST:event_cadUserActionPerformed

    private void devolveLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolveLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devolveLivroActionPerformed

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
    private javax.swing.JButton cadUser;
    private javax.swing.JButton cadlivro;
    private javax.swing.JButton devolveLivro;
    private javax.swing.JButton emprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableEmprestimos;
    private javax.swing.JTable tableLivros;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
