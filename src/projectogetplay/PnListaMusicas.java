/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

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
        jBAddMusicPLaylist = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBFavorBlack = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(830, 100));

        jLabPListName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabPListName.setText("All Musics");
        jLabPListName.setToolTipText("");

        try{
            jLabPListName1.setText("Number of musics: ");
        }catch(Exception e){}
        jLabPListName1.setToolTipText("");

        jBAddMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-plus-icon-icon.png"))); // NOI18N
        jBAddMusic.setBorder(null);
        jBAddMusic.setContentAreaFilled(false);
        jBAddMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBAddMusic.setMaximumSize(new java.awt.Dimension(30, 25));
        jBAddMusic.setMinimumSize(new java.awt.Dimension(30, 25));
        jBAddMusic.setPreferredSize(new java.awt.Dimension(30, 25));
        jBAddMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddMusicActionPerformed(evt);
            }
        });

        jBEditMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-pencil-icon-icon.png"))); // NOI18N
        jBEditMusic.setBorder(null);
        jBEditMusic.setContentAreaFilled(false);
        jBEditMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBEditMusic.setMaximumSize(new java.awt.Dimension(30, 25));
        jBEditMusic.setMinimumSize(new java.awt.Dimension(30, 25));
        jBEditMusic.setPreferredSize(new java.awt.Dimension(30, 25));
        jBEditMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEditMusicMouseClicked(evt);
            }
        });

        jBRemoveMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-minus-icon-icon.png"))); // NOI18N
        jBRemoveMusic.setBorder(null);
        jBRemoveMusic.setContentAreaFilled(false);
        jBRemoveMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBRemoveMusic.setMaximumSize(new java.awt.Dimension(30, 25));
        jBRemoveMusic.setMinimumSize(new java.awt.Dimension(30, 25));
        jBRemoveMusic.setPreferredSize(new java.awt.Dimension(30, 25));
        jBRemoveMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveMusicActionPerformed(evt);
            }
        });

        jBAddMusicPLaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Plus-icon.png"))); // NOI18N
        jBAddMusicPLaylist.setText("add music in my PlayList");
        jBAddMusicPLaylist.setBorder(null);
        jBAddMusicPLaylist.setContentAreaFilled(false);
        jBAddMusicPLaylist.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBAddMusicPLaylist.setMaximumSize(new java.awt.Dimension(71, 25));
        jBAddMusicPLaylist.setMinimumSize(new java.awt.Dimension(71, 25));
        jBAddMusicPLaylist.setPreferredSize(new java.awt.Dimension(71, 25));
        jBAddMusicPLaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddMusicPLaylistActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Favorite_32.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(33, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(33, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(33, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBFavorBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Favorite_32_black.png"))); // NOI18N
        jBFavorBlack.setBorder(null);
        jBFavorBlack.setContentAreaFilled(false);
        jBFavorBlack.setMaximumSize(new java.awt.Dimension(33, 25));
        jBFavorBlack.setMinimumSize(new java.awt.Dimension(33, 25));
        jBFavorBlack.setPreferredSize(new java.awt.Dimension(33, 25));
        jBFavorBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFavorBlackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFavorBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAddMusicPLaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName)
                        .addGap(0, 760, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabPListName)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabPListName1)
                        .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAddMusicPLaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBFavorBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddMusicActionPerformed
        new JdCreateMusic(p, true).setVisible(true);
       
    }//GEN-LAST:event_jBAddMusicActionPerformed
    private void update() {
        p.getPnBaseTabela().removeAll();
        p.getPnBaseInfo().removeAll();

        p.getPnBaseTabela().add(p.getPnTabelaMusica());
        p.getPnBaseInfo().add(p.getPnListaMusicas());
        p.getPnTabelaMusica().repaint();
        p.getPnTabelaMusica().revalidate();

        p.repaint();
        p.revalidate();

    }
    private void jBEditMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditMusicMouseClicked
        if (p.getLogged() == null) {
            JOptionPane.showMessageDialog(this, "Please sign in to edit a music",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        final JTable tabela = p.getPnTabelaMusica().getTblMusic();
        int rowIndex = tabela.getSelectedRow();
        this.m = p.getApp().searchMusic(p.getPnTabelaMusica().getCliqueMusica());
        //linhas seleccionada na tabela
        if (rowIndex != -1) {
            if (m.getCreatorEmail().equals(p.getLogged().getEmail())) {
                JdEditMusic jdEditMusic = new JdEditMusic(p, true);
                jdEditMusic.fillFields(m);
                jdEditMusic.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "You don´t have permission to change this music",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select one music from the table",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        p.getPnTabelaMusica().getModelo().fireTableDataChanged();
        update();
    }//GEN-LAST:event_jBEditMusicMouseClicked


    private void jBRemoveMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveMusicActionPerformed
        final JTable tabela = p.getPnTabelaMusica().getTblMusic();
        int rowIndex = tabela.getSelectedRow();
        //System.out.println("rowIndex: "+rowIndex);
        int cod = p.getPnTabelaMusica().getCliqueMusica();
        this.m = p.getApp().searchMusic(cod);
        //linhas seleccionada na tabela
            if (m.getCreatorEmail().equals(p.getLogged().getEmail())) {

                p.getApp().removeMusic(m);
                p.getPnTabelaMusica().removeLinha();

                //Actualiza a tabela de musicas
                p.getPnBaseTabela().removeAll();
                p.getPnBaseInfo().removeAll();

                p.getPnBaseTabela().add(new PnTabelaMusica(p, p.getApp().getMusicsList()));
                p.getPnBaseInfo().add(p.getPnListaMusicas());

                p.revalidate();
                p.repaint();
                JOptionPane.showMessageDialog(this, "Music Removed", "Success", JOptionPane.INFORMATION_MESSAGE);

            }else if(rowIndex == -1){
                JOptionPane.showMessageDialog(this, "Please select one music from the table",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }         
            else {
                JOptionPane.showMessageDialog(this, "You don´t have permission to remove this music",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        update();
    }//GEN-LAST:event_jBRemoveMusicActionPerformed

    private void jBAddMusicPLaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddMusicPLaylistActionPerformed
        System.out.println("Aqui");
        final JTable tabela = p.getPnTabelaMusica().getTblMusic();
        int rowIndex = tabela.getSelectedRow();
        int playlistIndex = p.getPnColuna().getMyPlaylistsList().getSelectedIndex();
     
        int cod = p.getPnTabelaMusica().getCliqueMusica();
        this.m = p.getApp().searchMusic(cod);

        System.out.println("Logado: " + p.getLogged().toString());
        System.out.println("NumPlaylists do logged: " + p.getLogged().getPlaylists().size());

        if (playlistIndex != -1 && p.getPnColuna().getPlaylistProp().
                get(playlistIndex).existeMusicPlaylist(cod)) {
            JOptionPane.showMessageDialog(this, "The music was already added to this playlist before",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (rowIndex == -1 && playlistIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select one music from the table and a Playlist from MyPlaylist.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (rowIndex == -1 && playlistIndex != -1) {
                JOptionPane.showMessageDialog(this, "Please select one music from the table",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ( playlistIndex == -1 && rowIndex != -1) {
                JOptionPane.showMessageDialog(this, "Please select one playlist from \"My Playlist\" list",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Playlist playlist = p.getPnColuna().getPlaylistProp().get(playlistIndex);
                playlist.addMusicPlaylist(cod);
                
                JOptionPane.showMessageDialog(this, "Music added to playlist " + playlist.getName(), "Success", JOptionPane.INFORMATION_MESSAGE);
                p.getPnTabelaMusica().getTblMusic().clearSelection();
                p.getPnColuna().getMyPlaylistsList().clearSelection();
                
                p.revalidate();
                p.repaint();
            }
        }
        
    }//GEN-LAST:event_jBAddMusicPLaylistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTable tabela = p.getPnTabelaMusica().getTblMusic();
        int rowIndex = tabela.getSelectedRow();
        int musicCode = p.getPnTabelaMusica().getCliqueMusica(); 
        this.m = p.getApp().searchMusic(musicCode);
        
        //linhas seleccionada na tabela
        if (rowIndex != -1 || p.getPnColuna().getMyPlaylistsList().getSelectedIndex() !=-1) {
            m.setFavorite(true);
             JOptionPane.showMessageDialog(this, "Favorite Music",
                    "Favorite", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/icons/Favorite_32.png")));
            
             
             //Actualiza os dados da tabela, gera uma nova tabela e mostra-a
             p.getPnBaseTabela().removeAll();
             p.setPnTabelaMusica(new PnTabelaMusica (p, p.getApp().getMusicsList()));
             p.getPnTabelaMusica().refresh();

             p.getPnBaseTabela().add(p.getPnTabelaMusica());
             p.revalidate();
             p.repaint();


        }else{
            JOptionPane.showMessageDialog(this, "Please select a music",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBFavorBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFavorBlackActionPerformed
        final JTable tabela = p.getPnTabelaMusica().getTblMusic();
        int rowIndex = tabela.getSelectedRow();
        int musicCode = p.getPnTabelaMusica().getCliqueMusica(); 
        this.m = p.getApp().searchMusic(musicCode);
        //linhas seleccionada na tabela
        if (rowIndex != -1 || rowIndex != -1 || p.getPnColuna().getMyPlaylistsList().getSelectedIndex() !=-1) {
            m.setFavorite(false);
            JOptionPane.showMessageDialog(this, "This is not your favorite Music",
                    "Favorite", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/icons/Favorite_32_black.png")));
            

            //Actualiza os dados da tabela, gera uma nova tabela e mostra-a
             p.getPnBaseTabela().removeAll();
             p.setPnTabelaMusica(new PnTabelaMusica (p, p.getApp().getMusicsList()));
             p.getPnTabelaMusica().refresh();

             p.getPnBaseTabela().add(p.getPnTabelaMusica());
             p.revalidate();
             p.repaint();
             
        }else{
             JOptionPane.showMessageDialog(this, "Please select a music",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBFavorBlackActionPerformed

    public JLabel getjLabPListName() {
        return jLabPListName;
    }

    public void setjLabPListName(JLabel jLabPListName) {
        this.jLabPListName = jLabPListName;
    }

    public JLabel getjLabPListName1() {
        return jLabPListName1;
    }

    public void setjLabPListName1(JLabel jLabPListName1) {
        this.jLabPListName1 = jLabPListName1;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddMusic;
    private javax.swing.JButton jBAddMusicPLaylist;
    private javax.swing.JButton jBEditMusic;
    private javax.swing.JButton jBFavorBlack;
    private javax.swing.JButton jBRemoveMusic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabPListName;
    private javax.swing.JLabel jLabPListName1;
    // End of variables declaration//GEN-END:variables
}
