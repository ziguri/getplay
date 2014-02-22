/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aires
 */
public class PnListaMusicas extends javax.swing.JPanel {

    protected Principal p;
    private Music m;
    private Playlist play;
    /**
     * Creates new form PnMusica
     */
    
    /**
     * Creates new form PnMusica
     * @param p
     */
    public PnListaMusicas(Principal p) {
        
        this.p=p;
        initComponents();
        
    }
    
     public PnListaMusicas(Principal p, Playlist play) {
        
        this.play=play;
        this.p=p;
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

        jLabPListName = new javax.swing.JLabel();
        jLabPListName1 = new javax.swing.JLabel();
        jBAddMusic = new javax.swing.JButton();
        jBEditMusic = new javax.swing.JButton();
        jBRemoveMusic = new javax.swing.JButton();
        jBAddMusic1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(830, 100));

        jLabPListName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabPListName.setText("All Musics");
        jLabPListName.setToolTipText("");

        try{
            jLabPListName1.setText("Number of musics: " + p.getApp().getMusicsList().size());
        }catch(Exception e){}
        jLabPListName1.setToolTipText("");

        jBAddMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Plus-icon.png"))); // NOI18N
        jBAddMusic.setText("add music");
        jBAddMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBAddMusic.setContentAreaFilled(false);
        jBAddMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBAddMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBAddMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBAddMusic.setPreferredSize(new java.awt.Dimension(71, 20));
        jBAddMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddMusicActionPerformed(evt);
            }
        });

        jBEditMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit-icon.png"))); // NOI18N
        jBEditMusic.setText(" edit");
        jBEditMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBEditMusic.setContentAreaFilled(false);
        jBEditMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBEditMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBEditMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBEditMusic.setPreferredSize(new java.awt.Dimension(71, 20));
        jBEditMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEditMusicMouseClicked(evt);
            }
        });

        jBRemoveMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Minus-icon.png"))); // NOI18N
        jBRemoveMusic.setText("remove");
        jBRemoveMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBRemoveMusic.setContentAreaFilled(false);
        jBRemoveMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBRemoveMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBRemoveMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBRemoveMusic.setPreferredSize(new java.awt.Dimension(71, 20));
        jBRemoveMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveMusicActionPerformed(evt);
            }
        });

        jBAddMusic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Plus-icon.png"))); // NOI18N
        jBAddMusic1.setText("add music to PlayList");
        jBAddMusic1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBAddMusic1.setContentAreaFilled(false);
        jBAddMusic1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBAddMusic1.setMaximumSize(new java.awt.Dimension(71, 20));
        jBAddMusic1.setMinimumSize(new java.awt.Dimension(71, 20));
        jBAddMusic1.setPreferredSize(new java.awt.Dimension(71, 20));
        jBAddMusic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddMusic1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabPListName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName1)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddMusic1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAddMusic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabPListName)
                        .addComponent(jLabPListName1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddMusicActionPerformed
        new JdCreateMusic(p, true).setVisible(true);
       
    }//GEN-LAST:event_jBAddMusicActionPerformed

    private void jBEditMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditMusicMouseClicked
        this.m = p.getApp().searchMusic(p.getPnTabelaMusica().getCliqueMusica());
        System.out.println(m);
        
        if(m.getCreatorEmail().equals(p.getLogged().getEmail())){
            JdEditMusic jdEditMusic=new JdEditMusic(p, true);
            jdEditMusic.fillFields(m);
            jdEditMusic.setVisible(true);
//            ;
//                p.jdEditMusic.setVisible(true);
//                
           // p.jdEditMusic.fillFields(m);
           //p.jdEditMusic.revalidate();
           // p.jdEditMusic.repaint();
        }else{
            JOptionPane.showMessageDialog(this, "You don´t have permission to change this music",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jBEditMusicMouseClicked

    private void jBRemoveMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveMusicActionPerformed
        int cod = p.getPnTabelaMusica().getCliqueMusica();
        Music mu = p.getApp().searchMusic(cod);
        
        if(mu!=null){
        
            if(mu.getCreatorEmail().equalsIgnoreCase(p.getLogged().getEmail())){

                p.getApp().removeMusic(mu);
                p.getPnTabelaMusica().removeLinha();

                //Actualiza a tabela de musicas
                p.getPnBaseTabela().removeAll();
                p.getPnBaseInfo().removeAll();

                p.getPnBaseTabela().add(new PnTabelaMusica(p));
                p.getPnBaseInfo().add(p.getPnListaMusicas());

                p.revalidate();
                p.repaint();
                JOptionPane.showMessageDialog(this, "Music Removed", "Success", JOptionPane.INFORMATION_MESSAGE);


            }   
            else{

                JOptionPane.showMessageDialog(this, "You don´t have permission to remove this music",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
        
             JOptionPane.showMessageDialog(this, "Please select one music from the table",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBRemoveMusicActionPerformed

    private void jBAddMusic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddMusic1ActionPerformed
        int index = p.getPnColuna().getMyPlaylistsList().getSelectedIndex();
        
        if(!(p.getPnColuna().getPublicPlaylists().isSelectionEmpty())){
        
            JOptionPane.showMessageDialog(this, "You can´t add musics to public playlists.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if(p.getPnColuna().getMyPlaylistsList().isSelectionEmpty()){
        
            JOptionPane.showMessageDialog(this, "Please select one playlist from your personal playlists.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            Playlist playlis = p.getPnColuna().getPlaylistProp().get(p.getPnColuna().getMyPlaylistsList().getSelectedIndex());
            playlis.addMusicPlaylist(p.getPnTabelaMusica().getMusicSelecionada().getMusicCode());
            JOptionPane.showMessageDialog(this, "Music successfuly added to playlist " + playlis.getName(), "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jBAddMusic1ActionPerformed

    public Principal getP() {
        return p;
    }

    public void setP(Principal p) {
        this.p = p;
    }

    public Music getM() {
        return m;
    }

    public void setM(Music m) {
        this.m = m;
    }

    public JLabel getjLabPListName() {
        return jLabPListName;
    }

    public void setjLabPListName(JLabel jLabPListName) {
        this.jLabPListName = jLabPListName;
    }

    public JLabel getjLabPListNumbMusics() {
        return jLabPListName1;
    }

    public void setjLabPListNumbMusics(JLabel jLabPListNumbMusics) {
        this.jLabPListName1 = jLabPListNumbMusics;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddMusic;
    private javax.swing.JButton jBAddMusic1;
    private javax.swing.JButton jBEditMusic;
    private javax.swing.JButton jBRemoveMusic;
    private javax.swing.JLabel jLabPListName;
    private javax.swing.JLabel jLabPListName1;
    // End of variables declaration//GEN-END:variables
}
