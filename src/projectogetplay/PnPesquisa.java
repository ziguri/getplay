/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aires
 */
public class PnPesquisa extends javax.swing.JPanel {

    protected Principal pagPrincipal;

    /**
     * Creates new form PnPesquisa
     */

    /**
     * Creates new form PnPesquisa
     *
     * @param p
     */
    public PnPesquisa(Principal p) {

        this.pagPrincipal = p;
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

        searchGroup = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        menuEditar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuEliminar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuLogout = new javax.swing.JMenuItem();
        lblHello = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        choiceTitle = new javax.swing.JRadioButton();
        choiceArtist = new javax.swing.JRadioButton();
        both = new javax.swing.JRadioButton();
        btnSettings = new javax.swing.JButton();

        menuEditar.setText("Edit Account");
        menuEditar.setToolTipText("");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        popupMenu.add(menuEditar);
        popupMenu.add(jSeparator1);

        menuEliminar.setText("Delete Account");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        popupMenu.add(menuEliminar);
        popupMenu.add(jSeparator2);

        menuLogout.setText("Log Out");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        popupMenu.add(menuLogout);

        setMinimumSize(new java.awt.Dimension(830, 60));

        lblHello.setText("Hello");

        try{
            lblUserName.setText(pagPrincipal.getLogged().getName());
        }catch(Exception e){}

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchGroup.add(choiceTitle);
        choiceTitle.setText("Title");

        searchGroup.add(choiceArtist);
        choiceArtist.setText("Artist");

        searchGroup.add(both);
        both.setText("Both");

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings2.png"))); // NOI18N
        btnSettings.setToolTipText("");
        btnSettings.setContentAreaFilled(false);
        btnSettings.setPreferredSize(new java.awt.Dimension(22, 22));
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                        .addComponent(lblHello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(choiceTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choiceArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(both)
                        .addGap(563, 563, 563))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHello)
                        .addComponent(lblUserName)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceTitle)
                    .addComponent(choiceArtist)
                    .addComponent(both)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        popupMenu.show(btnSettings, -80, 22);
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        pagPrincipal.logOut();
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed

        //Remove todas as musicas inseridas pelo utilizador, na lista de musicas
        //e nas playlists de outros utilizadores
        pagPrincipal.getApp().removeAllUserMusics(pagPrincipal.getLogged());

        //Remove o utilizador da lista de utilizadores
        pagPrincipal.getApp().removeUser(pagPrincipal.getLogged());
        pagPrincipal.logOut();
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        new JdlEditaUtilizador(pagPrincipal, true).setVisible(true);
    }//GEN-LAST:event_menuEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CharSequence txtpesquisa = searchBox.getText();
        ArrayList<Music> dados = pagPrincipal.getApp().getMusicsList();
        ArrayList<Music> listPesquisa = new ArrayList<Music>();

        if (txtpesquisa.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty searchbox!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (choiceArtist.isSelected()) {
                for (Music music : dados) {
                    if (music.getAuthor().contains(txtpesquisa)) {
                        listPesquisa.add(music);
                    }
                }
            }
            if (choiceTitle.isSelected()) {
                for (Music music : dados) {
                    if (music.getName().contains(txtpesquisa)) {
                        listPesquisa.add(music);
                    }
                }
            }
            if (both.isSelected()) {
                for (Music music : dados) {
                    if (music.getName().contains(txtpesquisa)) {
                        listPesquisa.add(music);
                    }
                }
            }

//        pagPrincipal.getPnBaseTabela().removeAll();
//        pagPrincipal.getPnBaseTabela().add(new PnTabelaMusica(pagPrincipal));
//        pagPrincipal.getPnBaseTabela().revalidate();
//        pagPrincipal.getPnBaseTabela().repaint();
//        pagPrincipal.getPnTabelaMusica().atribuiDados(listPesquisa);
//        pagPrincipal.getPnTabelaMusica().refresh();
            pagPrincipal.getPnBaseTabela().removeAll();
            PnTabelaMusica novo = new PnTabelaMusica(pagPrincipal);
            pagPrincipal.getPnBaseTabela().add(novo);
            pagPrincipal.getPnTabelaMusica().atribuiDados(listPesquisa);
            //pagPrincipal.getPnTabelaMusica().refresh();
            pagPrincipal.getPnBaseTabela().revalidate();
            pagPrincipal.getPnBaseTabela().repaint();
            //pagPrincipal.getPnTabelaMusica().refresh();

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public JLabel getLblUserName() {
        return lblUserName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton both;
    private javax.swing.JButton btnSettings;
    private javax.swing.JRadioButton choiceArtist;
    private javax.swing.JRadioButton choiceTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTextField searchBox;
    private javax.swing.ButtonGroup searchGroup;
    // End of variables declaration//GEN-END:variables
}
