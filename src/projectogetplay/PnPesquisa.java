/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

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
     * @param p
     */
    public PnPesquisa(Principal p) {
        this.pagPrincipal=p;
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
        jRadioButton1 = new javax.swing.JRadioButton();
        btnSettings = new javax.swing.JButton();

        menuEditar.setText("Edit Account");
        menuEditar.setToolTipText("");
        popupMenu.add(menuEditar);
        popupMenu.add(jSeparator1);

        menuEliminar.setText("Delete Account");
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

        lblUserName.setText(pagPrincipal.getLogged().getName());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(20, 20));

        searchGroup.add(choiceTitle);
        choiceTitle.setText("Title");

        searchGroup.add(choiceArtist);
        choiceArtist.setText("Artist");

        searchGroup.add(jRadioButton1);
        jRadioButton1.setText("Both");

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
                        .addComponent(jRadioButton1)
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
                    .addComponent(jRadioButton1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        popupMenu.show(btnSettings, -80, 22);
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        pagPrincipal.setLogged(null);
        
        pagPrincipal.getPnBaseLogin().remove(this);  
        pagPrincipal.getPnBaseColuna().removeAll();
        pagPrincipal.getPnBaseTabela().removeAll();
        pagPrincipal.getPnBaseInfo().removeAll();
        
        pagPrincipal.getApp().guardaFoMusics();
   
        pagPrincipal.revalidate();
        pagPrincipal.repaint();

        pagPrincipal.getLbFixoEmail().setVisible(true);
        pagPrincipal.getLbFixoPassword().setVisible(true);
        pagPrincipal.getBotaoLogin().setVisible(true);
        pagPrincipal.getBotaoRegistar().setVisible(true);
        pagPrincipal.getEmailField().setVisible(true);
        pagPrincipal.getPasswordField().setVisible(true);
        
        
        
    }//GEN-LAST:event_menuLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSettings;
    private javax.swing.JRadioButton choiceArtist;
    private javax.swing.JRadioButton choiceTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
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
