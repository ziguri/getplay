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
public class PnMusica extends javax.swing.JPanel {

    protected Principal pagPrincipal;
    /**
     * Creates new form PnMusica
     */
    
    public PnMusica(Principal p) {
        initComponents();
        this.pagPrincipal=p;
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

        setMinimumSize(new java.awt.Dimension(830, 100));

        jLabPListName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabPListName.setText("Playlist Directory");
        jLabPListName.setToolTipText("");

        jLabPListName1.setText("number of playlist");
        jLabPListName1.setToolTipText("");

        jBAddMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Plus-icon.png"))); // NOI18N
        jBAddMusic.setText("new playlist");
        jBAddMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBAddMusic.setContentAreaFilled(false);
        jBAddMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBAddMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBAddMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBAddMusic.setPreferredSize(new java.awt.Dimension(71, 20));

        jBEditMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit-icon.png"))); // NOI18N
        jBEditMusic.setText(" edit");
        jBEditMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBEditMusic.setContentAreaFilled(false);
        jBEditMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBEditMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBEditMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBEditMusic.setPreferredSize(new java.awt.Dimension(71, 20));

        jBRemoveMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basic-Minus-icon.png"))); // NOI18N
        jBRemoveMusic.setText("remove");
        jBRemoveMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBRemoveMusic.setContentAreaFilled(false);
        jBRemoveMusic.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jBRemoveMusic.setMaximumSize(new java.awt.Dimension(71, 20));
        jBRemoveMusic.setMinimumSize(new java.awt.Dimension(71, 20));
        jBRemoveMusic.setPreferredSize(new java.awt.Dimension(71, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, Short.MAX_VALUE)
                        .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabPListName)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabPListName1)
                    .addComponent(jBAddMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddMusic;
    private javax.swing.JButton jBEditMusic;
    private javax.swing.JButton jBRemoveMusic;
    private javax.swing.JLabel jLabPListName;
    private javax.swing.JLabel jLabPListName1;
    // End of variables declaration//GEN-END:variables
}
