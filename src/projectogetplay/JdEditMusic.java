/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Bruno Maricato
 */
public class JdEditMusic extends javax.swing.JDialog {

    protected Principal p;
    private Music m;
    private int rowIndex;

    /**
     * Creates new form CreateMusic
     */
    public JdEditMusic(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//fecha janela mas não a aplicação
        this.setLocationRelativeTo(null);//abre jDialog no centro do ecran
        this.p = (Principal) parent;

        //não mostra as mensagens de erro 
        jLERROname.setVisible(false);
        jLERROAlbum.setVisible(false);
        jLERROYear.setVisible(false);
    }

    public void fillFields(Music m) {
        System.out.println(m);
            System.out.println(m.getAlbum());
            jTAlbum.setText(m.getAlbum());
            jTAlbum.setEditable(false);
            jTArtist.setText(m.getAuthor());
            jTArtist.setEditable(false);
            jTName.setText(m.getName());
            jTName.setEditable(false);
            String year = "" + m.getYear();
            jTYear.setText(year);
            jTYear.setEditable(false);
            repaint();
            revalidate();

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
        jTName = new javax.swing.JTextField();
        jTArtist = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTAlbum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBCancel = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jLERROAlbum = new javax.swing.JLabel();
        jLERROYear = new javax.swing.JLabel();
        jLERROname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Music");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setType(java.awt.Window.Type.UTILITY);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 3, 0, 3, 0, 3, 0, 3, 0};
        layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        getContentPane().setLayout(layout);

        jLabel1.setText("Title");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jTName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTName.setMinimumSize(new java.awt.Dimension(200, 25));
        jTName.setPreferredSize(new java.awt.Dimension(200, 25));
        jTName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jTName, gridBagConstraints);

        jTArtist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTArtist.setMinimumSize(new java.awt.Dimension(200, 25));
        jTArtist.setPreferredSize(new java.awt.Dimension(200, 25));
        jTArtist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTArtistFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTArtistFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jTArtist, gridBagConstraints);

        jLabel2.setText("Artist");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jTYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTYear.setMinimumSize(new java.awt.Dimension(40, 25));
        jTYear.setPreferredSize(new java.awt.Dimension(40, 25));
        jTYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTYearFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jTYear, gridBagConstraints);

        jLabel3.setText("Album");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jTAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTAlbum.setMinimumSize(new java.awt.Dimension(150, 25));
        jTAlbum.setPreferredSize(new java.awt.Dimension(150, 25));
        jTAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTAlbumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAlbumFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jTAlbum, gridBagConstraints);

        jLabel4.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jBCancel.setText("Cancel");
        jBCancel.setMaximumSize(new java.awt.Dimension(71, 25));
        jBCancel.setMinimumSize(new java.awt.Dimension(71, 25));
        jBCancel.setPreferredSize(new java.awt.Dimension(71, 25));
        jBCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelMouseClicked(evt);
            }
        });
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jBCancel, gridBagConstraints);

        jBSave.setText("Save");
        jBSave.setMaximumSize(new java.awt.Dimension(71, 25));
        jBSave.setMinimumSize(new java.awt.Dimension(71, 25));
        jBSave.setPreferredSize(new java.awt.Dimension(71, 25));
        jBSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSaveMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(jBSave, gridBagConstraints);

        jLERROAlbum.setForeground(new java.awt.Color(255, 0, 0));
        jLERROAlbum.setText("Please write de name of the album.");
        jLERROAlbum.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jLERROAlbum, gridBagConstraints);

        jLERROYear.setForeground(new java.awt.Color(255, 0, 0));
        jLERROYear.setText("Enter a valid year.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jLERROYear, gridBagConstraints);

        jLERROname.setForeground(new java.awt.Color(255, 0, 0));
        jLERROname.setText("Please enter the title of the music.");
        jLERROname.setMinimumSize(new java.awt.Dimension(100, 14));
        jLERROname.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        getContentPane().add(jLERROname, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSaveMouseClicked
        if (p.getLogged() == null) {
            JOptionPane.showMessageDialog(this, "Please sign in to edit a music",
                    "INFO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();//close window
            return;
        }

        //novos campos preenchidos pelo utilizador 
        String title = jTName.getText().trim();
        String artist = jTArtist.getText().trim();
        String album = jTAlbum.getText().trim();
        String year = jTYear.getText().trim();
        this.m = p.getApp().searchMusic(p.getPnTabelaMusica().getCliqueMusica());
        
        if (p.getApp().validateName(title)
                && p.getApp().validateName(album)
                && p.getApp().validateInt(year)
                && p.getApp().validateDate(year)) {
            p.getApp().editMusic(m, title, artist, album,
            Integer.parseInt(year));
            JOptionPane.showMessageDialog(null, "Musica alterada");
        } else {
            if (!p.getApp().validateName(title)) {
                jTName.setBorder(BorderFactory.createLineBorder(Color.RED));
                jLERROname.setVisible(true);
            }
            if (!p.getApp().validateName(album)) {
                jTAlbum.setBorder(BorderFactory.createLineBorder(Color.RED));
                jLERROAlbum.setVisible(true);
            }

            if (!p.getApp().validateInt(year) && p.getApp().validateDate(year)) {
                jTYear.setBorder(BorderFactory.createLineBorder(Color.RED));
                jLERROYear.setVisible(true);
            }
        }
        p.getApp().listMusics();
        this.dispose();//close window

    }//GEN-LAST:event_jBSaveMouseClicked

    private void jTNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNameFocusGained
        jTName.setEditable(true);
    }//GEN-LAST:event_jTNameFocusGained

    private void jTNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNameFocusLost
        String s = jTName.getText().trim();
        if (!p.getApp().validateName(s)) {
            jTName.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROname.setVisible(true);
        } else {
            jTName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROname.setVisible(false);
        }
    }//GEN-LAST:event_jTNameFocusLost

    private void jTAlbumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAlbumFocusGained
        jTAlbum.setEditable(true);
    }//GEN-LAST:event_jTAlbumFocusGained

    private void jTAlbumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAlbumFocusLost
        String s = jTAlbum.getText().trim();
        if (!p.getApp().validateName(s)) {
            jTAlbum.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROAlbum.setVisible(true);
        } else {
            jTAlbum.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROAlbum.setVisible(false);
        }
    }//GEN-LAST:event_jTAlbumFocusLost

    private void jTYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTYearFocusGained
        jTYear.setEditable(true);
    }//GEN-LAST:event_jTYearFocusGained

    private void jTYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTYearFocusLost
        String s = jTYear.getText().trim();
        if (!p.getApp().validateInt(s) || !p.getApp().validateDate(s)) {
            jTYear.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLERROYear.setVisible(true);
        } else {
            jTYear.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            jLERROYear.setVisible(false);
        }
    }//GEN-LAST:event_jTYearFocusLost

    private void jBCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelMouseClicked
        this.dispose(); //fecha a janela
    }//GEN-LAST:event_jBCancelMouseClicked

    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
        this.dispose(); //fecha a janela
    }//GEN-LAST:event_jBCancelActionPerformed

    private void jTArtistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTArtistFocusGained
        jTYear.setEditable(true);
    }//GEN-LAST:event_jTArtistFocusGained

    private void jTArtistFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTArtistFocusLost
        String s = jTArtist.getText().trim();
    }//GEN-LAST:event_jTArtistFocusLost

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
            java.util.logging.Logger.getLogger(JdEditMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdEditMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdEditMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdEditMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdEditMusic dialog = new JdEditMusic(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLERROYear;
    private javax.swing.JLabel jLERROname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTAlbum;
    private javax.swing.JTextField jTArtist;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTYear;
    // End of variables declaration//GEN-END:variables
}
