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
public class PnLeitor extends javax.swing.JPanel {

     protected Principal p;
    /**
     * Creates new form PnLeitor
     */
    
     public PnLeitor(Principal p) {
        initComponents();
        this.p=p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLTitleMusica = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1080, 100));
        setPreferredSize(new java.awt.Dimension(1080, 100));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Seek-forward-64.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Start-64.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Pause-64.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);

        jButton3.setText("jButton3");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Seek-Backward-64.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gnome-Media-Playback-Stop-64.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);

        jLTitleMusica.setText("Title Musica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(646, 646, 646)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4)
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTitleMusica)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLTitleMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int i = p.getPnTabelaMusica().getCliqueMusica();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLTitleMusica;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
