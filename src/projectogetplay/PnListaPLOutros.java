/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

import javax.swing.JLabel;

/**
 *
 * @author Aires
 */
public class PnListaPLOutros extends javax.swing.JPanel {

    protected Principal pagPrincipal;
    /**
     * Creates new form PnMusica
     */
    
    public PnListaPLOutros(Principal p) {
        initComponents();
        this.pagPrincipal=p;
    }

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

   public void setjLabPListName1txt(String txt) {
       jLabPListName1.setText(txt);
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
        jBRemoveMusic = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(830, 100));

        jLabPListName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabPListName.setText("Others Playlists");
        jLabPListName.setToolTipText("");

        jLabPListName1.setText("number of playlists");
        jLabPListName1.setToolTipText("");

        jBRemoveMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrows-Up-2-icon.png"))); // NOI18N
        jBRemoveMusic.setText("import playlist");
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
                    .addComponent(jLabPListName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabPListName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 640, Short.MAX_VALUE)
                        .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jBRemoveMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRemoveMusic;
    private javax.swing.JLabel jLabPListName;
    private javax.swing.JLabel jLabPListName1;
    // End of variables declaration//GEN-END:variables
}
