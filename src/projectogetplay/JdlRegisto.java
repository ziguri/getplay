/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.awt.Color;
import javax.swing.JOptionPane;

public class JdlRegisto extends javax.swing.JDialog {
    

    protected Principal pagPrincipal;
    /**
     * Creates new form JdlRegisto
     * @param pagPrincipal
     * @param modal
     */
    public JdlRegisto(Principal pagPrincipal, boolean modal) {
        
        initComponents();
        this.pagPrincipal=pagPrincipal;
    }
    
    /**
     * Recebe uma String com o e-mail e verifica se o padrão condiz com o descrito
     * na expressão regular. Devolve true se corresponder e false se não corresponder.
     * @param email
     * @return 
     */
    private boolean emailValidation(String email){
    
        String emailReg = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        return email.matches(emailReg);
    }
    
    /**
     * Recebe uma String com o nome e verifica se o padrão condiz com o descrito
     * na expressão regular. Devolve true se corresponder e false se não corresponder.
     * @param nome
     * @return 
     */
    private boolean nameValidation(String nome){
    
        String nomeReg = "^[\\p{L} .'-]+$";
        
        return nome.matches(nomeReg);
    }
    
    
    /**
     * Validate the name an email, user auxiliar methods with regex to validate
     * each one individualy. Return boolean with the result.
     * @param name
     * @param email
     * @return 
     */
    private boolean dataValidation(String name, String email){
    
        boolean validated=false;
        
        if(nameValidation(name) && emailValidation(email)){
        
            validated=true;
        }

        return validated;
    }
    
    /**
     * Receives two char[] from password fields and verify if the content
     * matches, return one boolean with the result. 
     * @param pass1
     * @param pass2
     * @return 
     */
    private boolean passwordValidation(char[] pass1, char[] pass2){
    
        boolean validated=false;
        
        String passw1 = String.valueOf(pass1);
        String passw2 = String.valueOf(pass2);
        
        if(passw1.equals(passw2)){
        
            validated = true;
        }
        
        return validated;
    }

    /*
    private boolean validaDados(String nome, String email, char[] pass1, char[] pass2) {

        
        String msg = "";
        boolean preenchido = true, verificacao;
        ValidadorEmail valida = new ValidadorEmail();

        if (nome.isEmpty()) {
            preenchido = false;
            msg += "Nome, ";
        }


        if (!valida.validarEmail(email)) {
            preenchido = false;
            msg +=  "Email, ";
        }

        //verificar password
        boolean verificapass = true;
        if (pass1.length != pass2.length) {
            verificapass = false;
        } else {
            verificapass = Arrays.equals(pass1, pass2);
        }

        if (!verificapass) {
            JOptionPane.showMessageDialog(null, msg, "As Password inseridas não são iguais", JOptionPane.ERROR_MESSAGE);
            //lblPass1AV.setVisible(true);
            //lblPass2AV.setVisible(true);
        }
        if (!preenchido) {
            
            JOptionPane.showMessageDialog(null, msg, "Existem campos nao preenchidos", JOptionPane.ERROR_MESSAGE);
        }

        verificacao = verificapass && preenchido;
        return verificacao;
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPass1 = new javax.swing.JLabel();
        lbPass2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        pwPass1 = new javax.swing.JPasswordField();
        pwPass2 = new javax.swing.JPasswordField();
        btnRegistar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(null);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Name");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("Email\n");

        lblPass1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPass1.setText("Password");

        lbPass2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPass2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPass2.setText("Confirm Password");
        lbPass2.setToolTipText("");

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        pwPass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwPass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwPass1FocusLost(evt);
            }
        });

        pwPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwPass2FocusLost(evt);
            }
        });

        btnRegistar.setText("Registar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_100.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPass2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblNome)
                        .addGap(6, 6, 6)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblEmail)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblPass1)
                        .addGap(6, 6, 6)
                        .addComponent(pwPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnRegistar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblNome))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEmail))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPass1))
                    .addComponent(pwPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass2)
                    .addComponent(pwPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistar))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
    }//GEN-LAST:event_txtEmailFocusGained

    private void pwPass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwPass1FocusGained
    }//GEN-LAST:event_pwPass1FocusGained

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        char[] pass1 = pwPass1.getPassword();
        char[] pass2 = pwPass2.getPassword();
        
        
        if(nome.isEmpty() || email.isEmpty() || pass1==null ||pass2==null){
        
            JOptionPane.showMessageDialog(this, "All the fields are mandatory", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            if(nameValidation(nome) && emailValidation(email) && passwordValidation(pass1, pass2)){
                
                CodificarMD5 md5= new CodificarMD5();
                String passEncrypt = CodificarMD5.cryptWithMD5(String.valueOf(pass2));
                
                pagPrincipal.getApp().addUser(new User(nome, email, passEncrypt));
                this.dispose();
            }
            else{
            
                JOptionPane.showMessageDialog(this, "Something is wrong, please check the red fields.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(nameValidation(txtNome.getText())){
        
            lblNome.setForeground(Color.black);
        }else{
        
            lblNome.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(emailValidation(txtEmail.getText())){
        
            lblEmail.setForeground(Color.black);
        }
        else{
        
            lblEmail.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void pwPass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwPass1FocusLost
        if(passwordValidation(pwPass1.getPassword(), pwPass2.getPassword())){
        
            lblPass1.setForeground(Color.black);
            lbPass2.setForeground(Color.black);
        }
        else{
        
            lblPass1.setForeground(Color.red);
            lbPass2.setForeground(Color.red);
            
        }
    }//GEN-LAST:event_pwPass1FocusLost

    private void pwPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwPass2FocusLost
        if(passwordValidation(pwPass1.getPassword(), pwPass2.getPassword())){
        
            lblPass1.setForeground(Color.black);
            lbPass2.setForeground(Color.black);
        }
        else{
        
            lblPass1.setForeground(Color.red);
            lbPass2.setForeground(Color.red);
            
        }
    }//GEN-LAST:event_pwPass2FocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbPass2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JPasswordField pwPass1;
    private javax.swing.JPasswordField pwPass2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
