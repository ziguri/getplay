/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3 {

    private final String filename;
    private Player player;

    // constructor that takes the name of an MP3 file
    public MP3(String filename) {
        this.filename = filename;
    }

    public void close() {
        if (player != null) {
            player.close();
        }
    }

    // play the MP3 file to the sound card
    public void play() {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (FileNotFoundException | JavaLayerException e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // run in new thread to play in background
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    System.out.println(e);
                }
            }
        }.start();

    }

}

