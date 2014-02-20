/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import javax.swing.JOptionPane;

/**
 *
 * @author Aires
 */
public class Principal extends javax.swing.JFrame {

    protected GetPlay app;
    protected User logged;

    public Principal() {
        initComponents();
        this.app = new GetPlay();
        this.logged = null;
        app.openFOUsers();
        //app.listMusics();
        //app.listUsers();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnBaseFundo = new javax.swing.JPanel();
        pnBaseColuna = new javax.swing.JPanel();
        pnBaseLogin = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        botaoRegistar = new javax.swing.JButton();
        lbFixoEmail = new javax.swing.JLabel();
        lbFixoPassword = new javax.swing.JLabel();
        pnBaseInfo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnBaseTabela = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Getplay");
        setMinimumSize(new java.awt.Dimension(1080, 701));
        setPreferredSize(new java.awt.Dimension(1080, 701));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnBaseFundo.setBackground(new java.awt.Color(255, 255, 102));
        pnBaseFundo.setMinimumSize(new java.awt.Dimension(1080, 100));
        pnBaseFundo.setPreferredSize(new java.awt.Dimension(1080, 100));
        pnBaseFundo.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(pnBaseFundo, gridBagConstraints);

        pnBaseColuna.setBackground(new java.awt.Color(102, 255, 102));
        pnBaseColuna.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pnBaseColuna.setMinimumSize(new java.awt.Dimension(250, 420));
        pnBaseColuna.setPreferredSize(new java.awt.Dimension(250, 420));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(pnBaseColuna, gridBagConstraints);

        pnBaseLogin.setBackground(new java.awt.Color(255, 102, 51));
        pnBaseLogin.setMinimumSize(new java.awt.Dimension(830, 60));
        pnBaseLogin.setPreferredSize(new java.awt.Dimension(830, 60));
        pnBaseLogin.setLayout(new java.awt.GridBagLayout());

        emailField.setToolTipText("");
        emailField.setPreferredSize(new java.awt.Dimension(111, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 434, 12, 0);
        pnBaseLogin.add(emailField, gridBagConstraints);

        passwordField.setToolTipText("");
        passwordField.setPreferredSize(new java.awt.Dimension(111, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 12, 0);
        pnBaseLogin.add(passwordField, gridBagConstraints);

        botaoLogin.setText("Log in");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 12, 0);
        pnBaseLogin.add(botaoLogin, gridBagConstraints);

        botaoRegistar.setText("Register");
        botaoRegistar.setToolTipText("");
        botaoRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 12, 10);
        pnBaseLogin.add(botaoRegistar, gridBagConstraints);

        lbFixoEmail.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 436, 0, 0);
        pnBaseLogin.add(lbFixoEmail, gridBagConstraints);

        lbFixoPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 18, 0, 0);
        pnBaseLogin.add(lbFixoPassword, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(pnBaseLogin, gridBagConstraints);

        pnBaseInfo.setBackground(new java.awt.Color(102, 102, 255));
        pnBaseInfo.setMinimumSize(new java.awt.Dimension(830, 100));
        pnBaseInfo.setPreferredSize(new java.awt.Dimension(830, 100));

        jButton1.setText("Teste Inserir musica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBaseInfoLayout = new javax.swing.GroupLayout(pnBaseInfo);
        pnBaseInfo.setLayout(pnBaseInfoLayout);
        pnBaseInfoLayout.setHorizontalGroup(
            pnBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBaseInfoLayout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(175, 175, 175))
        );
        pnBaseInfoLayout.setVerticalGroup(
            pnBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBaseInfoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(pnBaseInfo, gridBagConstraints);

        pnBaseTabela.setBackground(new java.awt.Color(255, 153, 204));
        pnBaseTabela.setMinimumSize(new java.awt.Dimension(830, 420));
        pnBaseTabela.setPreferredSize(new java.awt.Dimension(830, 420));

        javax.swing.GroupLayout pnBaseTabelaLayout = new javax.swing.GroupLayout(pnBaseTabela);
        pnBaseTabela.setLayout(pnBaseTabelaLayout);
        pnBaseTabelaLayout.setHorizontalGroup(
            pnBaseTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        pnBaseTabelaLayout.setVerticalGroup(
            pnBaseTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(pnBaseTabela, gridBagConstraints);

        pnLogo.setBackground(new java.awt.Color(255, 255, 153));
        pnLogo.setMinimumSize(new java.awt.Dimension(250, 160));
        pnLogo.setPreferredSize(new java.awt.Dimension(250, 160));

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        getContentPane().add(pnLogo, gridBagConstraints);

        menu.setMaximumSize(new java.awt.Dimension(56, 100));

        jMenu1.setText("File");
        menu.add(jMenu1);

        jMenu2.setText("Edit");
        menu.add(jMenu2);

        setJMenuBar(menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed

        if (emailField.getText().isEmpty() || passwordField.getPassword() == null) {

            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (!(app.existUser(emailField.getText()))) {

            JOptionPane.showMessageDialog(this, "User not found", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {

            logged = app.getUserWithEmail(emailField.getText());
            
            if (logged != null) {
                
                //desaparece o painel de login e aparece o painel de logado
                lbFixoEmail.setVisible(false);
                lbFixoPassword.setVisible(false);
                botaoLogin.setVisible(false);
                botaoRegistar.setVisible(false);
                emailField.setVisible(false);
                passwordField.setVisible(false);
                
                
                //ativar paineis
                pnBaseInfo.add(new PnMyPlayList(this));
                pnBaseColuna.add(new PnColuna(this));
                pnBaseLogin.add(new PnPesquisa(this));
                
                //carregar a lista de musica
                app.musicsList.clear();
                app.openFOMusic();
                //painel tabela
                pnBaseTabela.add(new PnTabelaMusica(this));
                
            //Só falta o código para preencher a tabela
            }

        }
        revalidate();
        repaint();
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new JdCreateMusic(this, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
        new JdlRegisto(this, true).setVisible(true);
    }//GEN-LAST:event_botaoRegistarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public GetPlay getApp() {
        return app;
    }

    public User getLogged() {
        return logged;
    }

    public void setLogged(User logged) {
        this.logged = logged;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lbFixoEmail;
    private javax.swing.JLabel lbFixoPassword;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnBaseColuna;
    private javax.swing.JPanel pnBaseFundo;
    private javax.swing.JPanel pnBaseInfo;
    private javax.swing.JPanel pnBaseLogin;
    private javax.swing.JPanel pnBaseTabela;
    private javax.swing.JPanel pnLogo;
    // End of variables declaration//GEN-END:variables
}
