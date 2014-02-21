/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Aires
 */
public class Principal extends javax.swing.JFrame {

    protected GetPlay app;
    protected User logged;
    private PnColuna pnColuna;
    private PnListaMusicas pnListaMusicas;
    private PnListaPLOutros pnListaPLOutros;        
    private PnMyPlayList pnMyPlaylist;
    private PnPesquisa pnPesquisa;
    private PnTabelaMusica pnTabelaMusica;
    private PnTabelaPlayList pnTabelaPlayList;
    protected JdEditMusic jdEditMusic;
    
    
    
    public Principal() {
        initComponents();
        
        //inicializa os paineis
        //this.pnListaMusicas=new PnListaMusicas(this);
        //this.pnListaPLOutros= new PnListaPLOutros(this);
        //this.pnMyPlaylist= new PnMyPlayList(this);
        //this.pnPesquisa= new PnPesquisa(this);
        //this.pnTabelaMusica = new PnTabelaMusica(this);
        //this.pnTabelaPlayList = new PnTabelaPlayList(this);
        //this.jdEditMusic = new JdEditMusic(this, true);
        //this.pnColuna = new PnColuna(this);
        //this.pnLeitor = new PnLeitor(this);
        
        this.app = new GetPlay();
        this.logged = null;
        app.openFOUsers();
        app.listMusics();
        app.listUsers();
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
        jBStop = new javax.swing.JButton();
        jBBackward = new javax.swing.JButton();
        jBPlay = new javax.swing.JButton();
        jBPause = new javax.swing.JButton();
        jBForward = new javax.swing.JButton();
        jLTitleMusica = new javax.swing.JLabel();
        pnBaseColuna = new javax.swing.JPanel();
        pnBaseLogin = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        botaoRegistar = new javax.swing.JButton();
        lbFixoEmail = new javax.swing.JLabel();
        lbFixoPassword = new javax.swing.JLabel();
        pnBaseInfo = new javax.swing.JPanel();
        pnBaseTabela = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Getplay");
        setMinimumSize(new java.awt.Dimension(1080, 701));
        setPreferredSize(new java.awt.Dimension(1080, 701));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnBaseFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnBaseFundo.setMinimumSize(new java.awt.Dimension(1080, 90));
        pnBaseFundo.setPreferredSize(new java.awt.Dimension(1080, 90));
        pnBaseFundo.setLayout(new java.awt.GridBagLayout());

        jBStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Stop-64.png"))); // NOI18N
        jBStop.setBorder(null);
        jBStop.setContentAreaFilled(false);
        jBStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnBaseFundo.add(jBStop, gridBagConstraints);

        jBBackward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Seek-Backward-64.png"))); // NOI18N
        jBBackward.setBorder(null);
        jBBackward.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        pnBaseFundo.add(jBBackward, gridBagConstraints);

        jBPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Start-64.png"))); // NOI18N
        jBPlay.setBorder(null);
        jBPlay.setContentAreaFilled(false);
        jBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnBaseFundo.add(jBPlay, gridBagConstraints);

        jBPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Pause-64.png"))); // NOI18N
        jBPause.setBorder(null);
        jBPause.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pnBaseFundo.add(jBPause, gridBagConstraints);

        jBForward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Seek-forward-64.png"))); // NOI18N
        jBForward.setBorder(null);
        jBForward.setContentAreaFilled(false);
        jBForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBForwardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pnBaseFundo.add(jBForward, gridBagConstraints);

        jLTitleMusica.setText("Title Musica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnBaseFundo.add(jLTitleMusica, gridBagConstraints);

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

        pnBaseLogin.setMinimumSize(new java.awt.Dimension(830, 70));
        pnBaseLogin.setPreferredSize(new java.awt.Dimension(830, 70));
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
        pnBaseInfo.setLayout(new javax.swing.BoxLayout(pnBaseInfo, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(pnBaseInfo, gridBagConstraints);

        pnBaseTabela.setMinimumSize(new java.awt.Dimension(830, 420));
        pnBaseTabela.setPreferredSize(new java.awt.Dimension(830, 420));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(pnBaseTabela, gridBagConstraints);

        pnLogo.setMinimumSize(new java.awt.Dimension(250, 170));
        pnLogo.setPreferredSize(new java.awt.Dimension(250, 170));
        pnLogo.setLayout(new javax.swing.BoxLayout(pnLogo, javax.swing.BoxLayout.LINE_AXIS));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        logo.setToolTipText("");
        pnLogo.add(logo);

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

    public void logOut(){
    
        setLogged(null);
        
        pnBaseLogin.remove(pnPesquisa);  
        pnBaseColuna.removeAll();
        pnBaseTabela.removeAll();
        pnBaseInfo.removeAll();
        
        app.guardaFoMusics();
   
        revalidate();
        repaint();

        lbFixoEmail.setVisible(true);
        lbFixoPassword.setVisible(true);
        botaoLogin.setVisible(true);
        botaoRegistar.setVisible(true);
        emailField.setVisible(true);
        passwordField.setVisible(true);
    }

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed

        if (emailField.getText().isEmpty() || passwordField.getPassword() == null) {

            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (!(app.existUser(emailField.getText()))) {

            JOptionPane.showMessageDialog(this, "User not found", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(!(app.passwordCorrect(emailField.getText(), String.valueOf(passwordField.getPassword())))){
        
            JOptionPane.showMessageDialog(this, "Password is incorrect.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        
        else {

            logged = app.getUserWithEmail(emailField.getText());
            
            if (logged != null) {
                
                emailField.setText("");
                passwordField.setText("");
                
                //desaparece o painel de login
                lbFixoEmail.setVisible(false);
                lbFixoPassword.setVisible(false);
                botaoLogin.setVisible(false);
                botaoRegistar.setVisible(false);
                emailField.setVisible(false);
                passwordField.setVisible(false);
                
                
                //ativar paineis
                //pnBaseInfo.removeAll();
                pnListaMusicas=new PnListaMusicas(this);
                pnBaseInfo.add(pnListaMusicas);   
                
                
                pnColuna = new PnColuna(this);
                pnBaseColuna.add(pnColuna);
                pnPesquisa = new PnPesquisa(this);
                pnBaseLogin.add(pnPesquisa);
                
                //carregar a lista de musica
                app.musicsList.clear();
                app.openFOMusic();
                
                //painel tabela               
                pnTabelaMusica = new PnTabelaMusica(this);
                pnBaseTabela.add(pnTabelaMusica);
                
            //Só falta o código para preencher a tabela
            }

        }
        revalidate();
        repaint();
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
        new JdlRegisto(this, true).setVisible(true);
        
    }//GEN-LAST:event_botaoRegistarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        app.guardaFoMusics();
        app.guardaFoUsers();
    }//GEN-LAST:event_formWindowClosing

    private void jBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayActionPerformed
        int musicCode = pnTabelaMusica.getCliqueMusica();
        try{
        getApp().startPlaying(musicCode);
        }catch(Exception e){
            System.out.println("ERRO não encontrou mp3"+e);
        }
    }//GEN-LAST:event_jBPlayActionPerformed

    private void jBStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStopActionPerformed
        getApp().stopPlaying();
    }//GEN-LAST:event_jBStopActionPerformed

    private void jBForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBForwardActionPerformed
        Music m = getApp().searchMusic(getPnTabelaMusica().getCliqueMusica());
        pnTabelaMusica = new PnTabelaMusica(this);
        
        
    }//GEN-LAST:event_jBForwardActionPerformed

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

    public JButton getBotaoLogin() {
        return botaoLogin;
    }

    public JButton getBotaoRegistar() {
        return botaoRegistar;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JLabel getLbFixoEmail() {
        return lbFixoEmail;
    }

    public JLabel getLbFixoPassword() {
        return lbFixoPassword;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JPanel getPnBaseColuna() {
        return pnBaseColuna;
    }

    public JPanel getPnBaseInfo() {
        return pnBaseInfo;
    }

    public JPanel getPnBaseLogin() {
        return pnBaseLogin;
    }

    public JPanel getPnBaseTabela() {
        return pnBaseTabela;
    }

    public void setPnPesquisa(PnPesquisa pnPesquisa) {
        this.pnPesquisa = pnPesquisa;
    }

    public void setPnBaseTabela(JPanel pnBaseTabela) {
        this.pnBaseTabela = pnBaseTabela;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jBBackward;
    private javax.swing.JButton jBForward;
    private javax.swing.JButton jBPause;
    private javax.swing.JButton jBPlay;
    private javax.swing.JButton jBStop;
    private javax.swing.JLabel jLTitleMusica;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lbFixoEmail;
    private javax.swing.JLabel lbFixoPassword;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnBaseColuna;
    private javax.swing.JPanel pnBaseFundo;
    private javax.swing.JPanel pnBaseInfo;
    private javax.swing.JPanel pnBaseLogin;
    private javax.swing.JPanel pnBaseTabela;
    private javax.swing.JPanel pnLogo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the pnColuna
     */
    public PnColuna getPnColuna() {
        return pnColuna;
    }

   

    /**
     * @return the pnListaMusicas
     */
    public PnListaMusicas getPnListaMusicas() {
        return pnListaMusicas;
    }

    /**
     * @return the pnListaPLOutros
     */
    public PnListaPLOutros getPnListaPLOutros() {
        return pnListaPLOutros;
    }

    /**
     * @return the pnMyPlaylist
     */
    public PnMyPlayList getPnMyPlaylist() {
        return pnMyPlaylist;
    }

    /**
     * @return the pnPesquisa
     */
    public PnPesquisa getPnPesquisa() {
        return pnPesquisa;
    }

    /**
     * @return the pnTabelaMusica
     */
    public PnTabelaMusica getPnTabelaMusica() {
        return pnTabelaMusica;
    }

    /**
     * @return the pnTabelaPlayList
     */
    public PnTabelaPlayList getPnTabelaPlayList() {
        return pnTabelaPlayList;
    }
}
