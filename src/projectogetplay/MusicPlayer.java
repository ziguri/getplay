/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectogetplay;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Bruno Maricato
 */
public class MusicPlayer extends javax.swing.JPanel {
    
    private MP3Player player;
    private Thread thread;
    
    public MusicPlayer() {
        this.player=null;
        //this.listMusic = new File("");        
    }
    
    public void playAll(ArrayList<File> playlist) {
        while (true) {
            if (thread == null) {
                final File f = playlist.listIterator().next();
                thread = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        player = new MP3Player(f);
                        player.play();
                        //mp3IsStillPlaying();      
                    }
                });
                thread.start();
            } else {
                if (!thread.isAlive()) {
                    thread.interrupt();
                    thread = null;
                }
            }
        } 
    }  

        
}

    

