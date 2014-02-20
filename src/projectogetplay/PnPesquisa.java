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
    
    public PnPesquisa(Principal p) {
        initComponents();
        pagPrincipal=p;
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
        lblHello = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        comboUserChoice = new javax.swing.JComboBox();
        searchBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        choiceTitle = new javax.swing.JRadioButton();
        choiceArtist = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(830, 60));

        lblHello.setText("Hello");

        lblUserName.setText(pagPrincipal.getLogged().getName());

        comboUserChoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Edit Account", "Delete Account", "Log Out" }));
        comboUserChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        comboUserChoice.setDoubleBuffered(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.setPreferredSize(new java.awt.Dimension(20, 20));

        searchGroup.add(choiceTitle);
        choiceTitle.setText("Title");

        searchGroup.add(choiceArtist);
        choiceArtist.setText("Artist");

        searchGroup.add(jRadioButton1);
        jRadioButton1.setText("Both");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                        .addComponent(lblHello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(choiceTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choiceArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(587, 587, 587))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHello)
                    .addComponent(lblUserName)
                    .addComponent(comboUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceTitle)
                    .addComponent(choiceArtist)
                    .addComponent(jRadioButton1)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton choiceArtist;
    private javax.swing.JRadioButton choiceTitle;
    private javax.swing.JComboBox comboUserChoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField searchBox;
    private javax.swing.ButtonGroup searchGroup;
    // End of variables declaration//GEN-END:variables
}
