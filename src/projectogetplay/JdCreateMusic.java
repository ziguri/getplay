/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Orlando Neves
 * @author Susana Cortez
 * @author Vitor Aires
 */
public class JdCreateMusic extends javax.swing.JDialog {

    protected Principal p;
    private String source;
    private String target;

    /**
     * Creates new form CreateMusic
     *
     * @param parent
     * @param modal
     */
    public JdCreateMusic(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.p = (Principal) parent;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//fecha janela mas não a aplicação
        this.setLocationRelativeTo(null);//abre jDialog no centro do ecran

        //não mostra as mensagens de erro 
        jLERROname.setVisible(false);
        jLERROAlbum.setVisible(false);
        jLERROano.setVisible(false);
        jLERROpath.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        jTMName = new javax.swing.JTextField();
        jTMArtist = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTMAlbum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTMYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTMPath = new javax.swing.JTextField();
        jBCancel = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jLUPLOAD = new javax.swing.JLabel();
        jLERROname = new javax.swing.JLabel();
        jLERROAlbum = new javax.swing.JLabel();
        jLERROano = new javax.swing.JLabel();
        jLERROpath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Music");
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setType(java.awt.Window.Type.UTILITY);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 3, 0, 3, 0, 3, 0, 3, 0};
        layout.rowHeights = new int[] {0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0};
        getContentPane().setLayout(layout);

        jLabel1.setText("Title");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jTMName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTMName.setMinimumSize(new java.awt.Dimension(200, 25));
        jTMName.setPreferredSize(new java.awt.Dimension(200, 25));
        jTMName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMNameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jTMName, gridBagConstraints);

        jTMArtist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTMArtist.setMinimumSize(new java.awt.Dimension(200, 25));
        jTMArtist.setName(""); // NOI18N
        jTMArtist.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jTMArtist, gridBagConstraints);

        jLabel2.setText("Artist");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jTMAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTMAlbum.setMinimumSize(new java.awt.Dimension(150, 25));
        jTMAlbum.setPreferredSize(new java.awt.Dimension(150, 25));
        jTMAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMAlbumFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jTMAlbum, gridBagConstraints);

        jLabel3.setText("Album");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jTMYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTMYear.setMinimumSize(new java.awt.Dimension(40, 25));
        jTMYear.setPreferredSize(new java.awt.Dimension(40, 25));
        jTMYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMYearFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jTMYear, gridBagConstraints);

        jLabel4.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("At path");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jTMPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTMPath.setMinimumSize(new java.awt.Dimension(200, 25));
        jTMPath.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jTMPath, gridBagConstraints);

        jBCancel.setText("Cancel");
        jBCancel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBCancel.setMaximumSize(new java.awt.Dimension(71, 25));
        jBCancel.setMinimumSize(new java.awt.Dimension(71, 25));
        jBCancel.setPreferredSize(new java.awt.Dimension(71, 25));
        jBCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(jBCancel, gridBagConstraints);

        jBSave.setText("Save");
        jBSave.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jBSave.setMaximumSize(new java.awt.Dimension(71, 25));
        jBSave.setMinimumSize(new java.awt.Dimension(71, 25));
        jBSave.setPreferredSize(new java.awt.Dimension(71, 25));
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(jBSave, gridBagConstraints);

        jLUPLOAD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLUPLOAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Upload-icon.png"))); // NOI18N
        jLUPLOAD.setMaximumSize(new java.awt.Dimension(25, 25));
        jLUPLOAD.setMinimumSize(new java.awt.Dimension(25, 25));
        jLUPLOAD.setOpaque(true);
        jLUPLOAD.setPreferredSize(new java.awt.Dimension(20, 20));
        jLUPLOAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLUPLOADMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        getContentPane().add(jLUPLOAD, gridBagConstraints);

        jLERROname.setForeground(new java.awt.Color(255, 0, 0));
        jLERROname.setText("Please enter the title of the music.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jLERROname, gridBagConstraints);

        jLERROAlbum.setForeground(new java.awt.Color(255, 0, 0));
        jLERROAlbum.setText("Please write de name of the album.");
        jLERROAlbum.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 0);
        getContentPane().add(jLERROAlbum, gridBagConstraints);

        jLERROano.setForeground(new java.awt.Color(255, 0, 0));
        jLERROano.setText("Enter a valid year.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jLERROano, gridBagConstraints);

        jLERROpath.setForeground(new java.awt.Color(255, 0, 0));
        jLERROpath.setText("Please upload a music.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLERROpath, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTMNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMNameFocusLost
        String s = jTMName.getText().trim();
        if (!p.getApp().validateName(s)) {
            jTMName.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROname.setVisible(true);
        } else {
            jTMName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROname.setVisible(false);
        }
    }//GEN-LAST:event_jTMNameFocusLost

    private void jTMAlbumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMAlbumFocusLost
        String s = jTMAlbum.getText().trim();
        if (!p.getApp().validateName(s)) {
            jTMAlbum.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROAlbum.setVisible(true);
        } else {
            jTMAlbum.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROAlbum.setVisible(false);
        }
    }//GEN-LAST:event_jTMAlbumFocusLost

    private void jTMYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMYearFocusLost
        String s = jTMYear.getText().trim();
        if (!p.getApp().validateInt(s) || !p.getApp().validateDate(s)) {
            jTMYear.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROano.setVisible(true);
        } else {
            jTMYear.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROano.setVisible(false);
        }
    }//GEN-LAST:event_jTMYearFocusLost

    private void jLUPLOADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUPLOADMouseClicked
        File file = p.getApp().chooseFiles(this, "wav", "mp3");//escolhe ficheiro
        jTMPath.setText(file.getName());//apenas estético
        repaint();
        revalidate();
        this.source = file.getAbsolutePath();//path origem
        String s = p.getApp().createDir();
        this.target = s + "/" + file.getName();//path destino       
    }//GEN-LAST:event_jLUPLOADMouseClicked

    private void jBCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelMouseClicked
        this.dispose(); //fecha a janela
    }//GEN-LAST:event_jBCancelMouseClicked

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        if (p.getLogged() == null) {
            JOptionPane.showMessageDialog(this, "Please sign in to add a music to your application",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            this.dispose();//close window
            return;
        }

        //preenchimento de campos pelo user
        String name = jTMName.getText().trim();
        String artist = jTMArtist.getText().trim();
        String album = jTMAlbum.getText().trim();
        String year = jTMYear.getText().trim();
        String path = jTMPath.getText().trim();
        String userEmail = p.getLogged().getEmail();

        if (p.getApp().existMusic(name, album)) {

            JOptionPane.showMessageDialog(this, "This music exist already!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            if (p.getApp().validateName(name)
                    && p.getApp().validateName(album)
                    && p.getApp().validateName(path)
                    && p.getApp().validateInt(year)
                    && p.getApp().validateDate(year)) {
                p.getApp().createMusic(name, artist, album, Integer.parseInt(year),
                        path, userEmail);
                
           
               p.getPnTabelaMusica().adicionaLinha(name, artist, album, Integer.parseInt(year), userEmail, path);

                p.getApp().copy(source, target);//copia ficheiro
                JOptionPane.showMessageDialog(this, "Add Music");
            } else {
                if (!p.getApp().validateName(name)) {
                    jTMName.setBorder(BorderFactory.createLineBorder(Color.RED));
                    jLERROname.setVisible(true);
                }
                if (!p.getApp().validateName(album)) {
                    jTMAlbum.setBorder(BorderFactory.createLineBorder(Color.RED));
                    jLERROAlbum.setVisible(true);
                }
                if (!p.getApp().validateName(path)) {
                    jTMPath.setBorder(BorderFactory.createLineBorder(Color.RED));
                    jLERROpath.setVisible(true);
                }
                if (!p.getApp().validateInt(year) && p.getApp().validateDate(year)) {
                    jTMYear.setBorder(BorderFactory.createLineBorder(Color.RED));
                    jLERROano.setVisible(true);
                }
            }
        }

        //Para actualizar a tabela de musicas a cada vez que insere nova
        p.getPnBaseTabela().removeAll();
        p.getPnBaseInfo().removeAll();

        p.getPnListaMusicas().getjLabPListName1().setText("Number of musics: " + p.getApp().getMusicsList().size());
        p.getPnBaseTabela().add(p.getPnTabelaMusica());
        p.getPnBaseInfo().add(p.getPnListaMusicas());

        p.revalidate();
        p.repaint();

        this.dispose();//close window
    }//GEN-LAST:event_jBSaveActionPerformed

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
            java.util.logging.Logger.getLogger(JdCreateMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdCreateMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdCreateMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdCreateMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdCreateMusic dialog = new JdCreateMusic(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBSave;
    private javax.swing.JLabel jLERROAlbum;
    private javax.swing.JLabel jLERROano;
    private javax.swing.JLabel jLERROname;
    private javax.swing.JLabel jLERROpath;
    private javax.swing.JLabel jLUPLOAD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTMAlbum;
    private javax.swing.JTextField jTMArtist;
    private javax.swing.JTextField jTMName;
    private javax.swing.JTextField jTMPath;
    private javax.swing.JTextField jTMYear;
    // End of variables declaration//GEN-END:variables
}
