/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.UIManager;

/**
 *
 * @author Aires
 */
public class Ina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Principal novo = new Principal();
        novo.setVisible(true);
        Action logout = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                //JFrame frame = (JFrame) e.getSource();
                Principal executavel= (Principal) e.getSource();
                //frame.dispose();
                executavel.logOut();
            }
        };

        InactivityListener listener = new InactivityListener(novo, logout, 1);
        listener.start();

    }

}
