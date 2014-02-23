/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aires
 */
public class PnColuna extends javax.swing.JPanel {

    protected Principal pagPrincipal;
    protected ArrayList <Playlist> playlistProp;
    protected ArrayList <Playlist> playlistPub;

    public PnColuna(Principal pagPrincipal){
        
        this.pagPrincipal=pagPrincipal;
        initComponents();
        buildAllLists ();
        
        
        //pagPrincipal.getApp().getUsersList().get(1).ge<
    }
    
    /**
     * Accessor method to build one playlist vector from a playlist ArrayList in
     * order to construct JList component.
     * @param playlists
     * @return 
     */
    public Playlist[] buildPlaylistListProp(ArrayList<Playlist> playlists){

        //Recebe um ArrayList de Playlist, transforma-o num vector e devolve-o 
        //pronto a adicionar à lista correspondente
        Playlist[] playL = playlists.toArray(new Playlist[0]);
        this.playlistProp=playlists;
        return playL;
        
    }
    
    /**
     * Accessor method to build one playlist vector from a playlist ArrayList in
     * order to construct JList component.
     * @param playlists
     * @return 
     */
    public Playlist[] buildPlaylistListPub(ArrayList<Playlist> playlists){

        //Recebe um ArrayList de Playlist, transforma-o num vector e devolve-o 
        //pronto a adicionar à lista correspondente
        Playlist[] playLP = playlists.toArray(new Playlist[0]);
        this.playlistPub=playlists;
        return playLP;
        
    }
    
    /**
     * Build all the lists to show in the main page. 
     */
    private void buildAllLists (){
    
        myPlaylistsList.setListData(buildPlaylistListProp(pagPrincipal.getLogged().getPlaylists()));
        publicPlaylists.setListData(buildPlaylistListPub(pagPrincipal.getApp().publicPlaylists()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myPlaylistsList = new javax.swing.JList();
        lbMyPlay = new javax.swing.JLabel();
        lblFixoAddPL = new javax.swing.JLabel();
        jLMinus = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnAllMusics = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        publicPlaylists = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(250, 420));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(250, 420));

        myPlaylistsList.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(myPlaylistsList);

        lbMyPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Folder-32.png"))); // NOI18N
        lbMyPlay.setText("My Playlists");
        lbMyPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbMyPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMyPlayMouseClicked(evt);
            }
        });

        lblFixoAddPL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Plus-icon.png"))); // NOI18N
        lblFixoAddPL.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblFixoAddPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFixoAddPLMouseClicked(evt);
            }
        });

        jLMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Minus-icon.png"))); // NOI18N
        jLMinus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinusMouseClicked(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Share", "Don´t Share", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/go.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAllMusics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FolderMusic_32.png"))); // NOI18N
        btnAllMusics.setText("All Musics");
        btnAllMusics.setBorder(null);
        btnAllMusics.setContentAreaFilled(false);
        btnAllMusics.setHideActionText(true);
        btnAllMusics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAllMusics.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAllMusics.setMaximumSize(new java.awt.Dimension(80, 25));
        btnAllMusics.setMinimumSize(new java.awt.Dimension(80, 25));
        btnAllMusics.setPreferredSize(new java.awt.Dimension(80, 25));
        btnAllMusics.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAllMusics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllMusicsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAllMusics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbMyPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblFixoAddPL)
                        .addGap(0, 0, 0)
                        .addComponent(jLMinus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAllMusics, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLMinus)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFixoAddPL))
                    .addComponent(lbMyPlay))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1))
        );

        publicPlaylists.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane2.setViewportView(publicPlaylists);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Folder-groups-32.png"))); // NOI18N
        jLabel2.setText("Public Playlists");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/go.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAllMusicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllMusicsActionPerformed
        pagPrincipal.getPnBaseTabela().removeAll();
        pagPrincipal.getPnBaseInfo().removeAll();
        
        pagPrincipal.getPnBaseTabela().add(pagPrincipal.getPnTabelaMusica());
        pagPrincipal.getPnBaseInfo().add(pagPrincipal.getPnListaMusicas());
        
        pagPrincipal.revalidate();
        pagPrincipal.repaint();
    }//GEN-LAST:event_btnAllMusicsActionPerformed

    private void lblFixoAddPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFixoAddPLMouseClicked
        JdNewPlaylist jdNewPlaylist = new JdNewPlaylist(pagPrincipal, true);
        jdNewPlaylist.setVisible(true);
    }//GEN-LAST:event_lblFixoAddPLMouseClicked

    private void jLMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinusMouseClicked
               
        myPlaylistsList.getSelectedIndex();
        if(myPlaylistsList.getSelectedIndex()==-1){
        
            JOptionPane.showMessageDialog(this, "Please select one playlist.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            pagPrincipal.getLogged().removePlaylist(this.playlistProp.get(this.myPlaylistsList.getSelectedIndex()));
            buildAllLists();
        }
    }//GEN-LAST:event_jLMinusMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         myPlaylistsList.getSelectedIndex();
         
         
        if(myPlaylistsList.getSelectedIndex()==-1){
        
            JOptionPane.showMessageDialog(this, "Please select one playlist.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            if(jComboBox1.getSelectedIndex()==0){
            
                pagPrincipal.getLogged().getPlaylistByName(this.playlistProp.
                        get(myPlaylistsList.getSelectedIndex()).getName()).
                        setShared(true);
            }
            else{
            
             pagPrincipal.getLogged().getPlaylistByName(this.playlistProp.
                     get(myPlaylistsList.getSelectedIndex()).getName()).
                     setShared(false);  
            }
            buildAllLists();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int index = myPlaylistsList.getSelectedIndex();
            
         //pagPrincipal.getPnTabelaMusica().atribuiDados(null);
         
            if (index != -1) {
                
                Playlist p = playlistProp.get(myPlaylistsList.getSelectedIndex());
                ArrayList<Music> msc = pagPrincipal.getApp().getMusiclistFromPlaylist(p.getMusics());
                
                pagPrincipal.getPnBaseInfo().removeAll();
                pagPrincipal.getPnBaseTabela().removeAll();
                
                //Preenche a tabela com musicas da playlist seleccionada
                
                PnTabelaMusica pntm= new PnTabelaMusica(pagPrincipal, msc);

                //pntm.atribuiDados(msc);
                pntm.refresh();
                pagPrincipal.getPnBaseTabela().add(pntm);
                
                
                
                //Preenche cabeçalho
                PnListaMusicas pnlist = new PnListaMusicas(pagPrincipal, p);
                pnlist.getjLabPListName().setText("Playlist " + p.getName());
                pnlist.getjLabPListName1().setText("Number of musics: "+msc.size());
                pagPrincipal.getPnBaseInfo().add(pnlist);
                pagPrincipal.revalidate();
                pagPrincipal.repaint();
                
            }
            
            else{
            
                JOptionPane.showMessageDialog(this, "Please select one playlist.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = publicPlaylists.getSelectedIndex();
            
         //pagPrincipal.getPnTabelaMusica().atribuiDados(null);
         
            if (index != -1) {
                
                Playlist p = playlistPub.get(publicPlaylists.getSelectedIndex());
                ArrayList<Music> msc = pagPrincipal.getApp().getMusiclistFromPlaylist(p.getMusics());
                
                pagPrincipal.getPnBaseInfo().removeAll();
                pagPrincipal.getPnBaseTabela().removeAll();
                
                //Preenche a tabela com musicas da playlist seleccionada
                
                PnTabelaMusica pntm= new PnTabelaMusica(pagPrincipal, msc);

                //pntm.atribuiDados(msc);
                pntm.refresh();
                pagPrincipal.getPnBaseTabela().add(pntm);
                
                
                
                //Preenche cabeçalho
                PnListaMusicas pnlist = new PnListaMusicas(pagPrincipal, p);
                pnlist.getjLabPListName().setText("Playlist " + p.getName());
                pnlist.getjLabPListName1().setText("Number of musics: "+msc.size());
                pagPrincipal.getPnBaseInfo().add(pnlist);
                pagPrincipal.revalidate();
                pagPrincipal.repaint();
                
            }
            
            else{
            
                JOptionPane.showMessageDialog(this, "Please select one playlist.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lbMyPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMyPlayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMyPlayMouseClicked

    public JList getMyPlaylistsList() {
        return myPlaylistsList;
    }

    public void setMyPlaylistsList(JList myPlaylistsList) {
        this.myPlaylistsList = myPlaylistsList;
    }

    public JList getPublicPlaylists() {
        return publicPlaylists;
    }

    public void setPublicPlaylists(JList publicPlaylists) {
        this.publicPlaylists = publicPlaylists;
    }

    public Principal getPagPrincipal() {
        return pagPrincipal;
    }

    public void setPagPrincipal(Principal pagPrincipal) {
        this.pagPrincipal = pagPrincipal;
    }

    public ArrayList<Playlist> getPlaylistProp() {
        return playlistProp;
    }

    public void setPlaylistProp(ArrayList<Playlist> playlistProp) {
        this.playlistProp = playlistProp;
    }

    public ArrayList<Playlist> getPlaylistPub() {
        return playlistPub;
    }

    public void setPlaylistPub(ArrayList<Playlist> playlistPub) {
        this.playlistPub = playlistPub;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllMusics;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLMinus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMyPlay;
    private javax.swing.JLabel lblFixoAddPL;
    private javax.swing.JList myPlaylistsList;
    private javax.swing.JList publicPlaylists;
    // End of variables declaration//GEN-END:variables
}
