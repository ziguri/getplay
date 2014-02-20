package projectogetplay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Orlando Neves
 * @author Susana Cortez
 * @author Vitor Aires
 */
public class GetPlay {

    protected ArrayList<User> usersList;
    protected ArrayList<Music> musicsList;
    private FicheiroDeObjetos fo;

    public GetPlay() {
        this.usersList = new ArrayList();
        this.musicsList = new ArrayList();
        fo = new FicheiroDeObjetos();
    }

    /**
     * Read a Music or User object file.
     *
     * @throws ClassNotFoundException
     */
    public void openFOUsers() {

        try {
            if (fo.abreLeitura("users.dat")) {
                usersList = (ArrayList<User>) fo.leObjeto();
                fo.fechaLeitura();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ficheiro não encontrado",
                    "Erro de leitura de Ficheiro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File is corrupt",
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void openFOMusic() {
        try {
            if (fo.abreLeitura("musics.dat")) {
                musicsList = (ArrayList<Music>) fo.leObjeto();
                fo.fechaLeitura();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not found",
                    "Erro de leitura de Ficheiro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File is corrupt",
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Write and save on a User object file.
     *
     */
    public void guardaFoUsers() {
        try {
            fo.abreEscrita("users.dat");
            fo.escreveObjeto(usersList);
            fo.fechaEscrita();
        } catch (IOException e) {
            System.out.println("ERROR: USER file wasn´t save");
        }
    }

    public void guardaFoMusics() {
        try {
            fo.abreEscrita("musics.dat");
            fo.escreveObjeto(musicsList);
            fo.fechaEscrita();
        } catch (IOException e) {
            System.out.println("ERROR: MUSIC file wasn´t save");
        }
    }

    /**
     * Constructs a User Object with attributes name, email, password
     *
     * @param aName
     * @param aEmail
     * @param aPassword
     */
    public void createUser(String aName, String aEmail, String aPassword) {
        this.usersList.add(new User(aName, aEmail, aPassword));
    }

    /**
     *
     * @param editUser User object to edit attributes
     * @param newName the new name of user
     * @param newEmail the new email of user
     * @param newPassword the new password of user
     */
    public void editUser(User editUser, String newName, String newEmail, String newPassword) {
        String email = editUser.getEmail();
        for (User u : usersList) {
            if (u.getEmail().equals(email)) {
                u.setName(newName);
                u.setEmail(newEmail);
                u.setPassword(newPassword);
            }
        }
    }

    /**
     * Constructs a Music object with all attributes name, author, album, year
     * path music e user email.
     *
     * @param aName
     * @param aAuthor
     * @param aAlbum
     * @param aYear
     * @param aMusicPath
     * @param aCreatorEmail
     */
    public void createMusic(String aName, String aAuthor, String aAlbum,
            int aYear, String aMusicPath, String aCreatorEmail) {
        this.musicsList.add(new Music(aName, aAuthor, aAlbum, aYear, aMusicPath,
                aCreatorEmail));
    }

    /**
     * Sets to a Music Object new attributes define by the user.
     *
     * @param editMusic
     * @param newName
     * @param newAuthor
     * @param newAlbum
     * @param newYear
     */
    public void editMusic(Music editMusic, String newName, String newAuthor, String newAlbum,
            int newYear) {
        String title = editMusic.getName();
        String album = editMusic.getAlbum();
        for (Music m : musicsList) {
            if (m.getName().equalsIgnoreCase(title) && m.getAlbum().equalsIgnoreCase(album)) {
                m.setName(newName);
                m.setAuthor(newAuthor);
                m.setAlbum(newAlbum);
                m.setYear(newYear);
            }
        }
    }

    /**
     *
     * @param emailUser user email to check
     * @return Returns true if user exists. False if user isn´t sign up in the
     * application
     */
    public boolean existUser(String emailUser) {
        for (User u : usersList) {
            if (u.getEmail().equals(emailUser)) {
                return true;
            }
        }
        if (emailUser.equals("admin")) {
            return true;
        }
        return false;
    }

    /**
     * Return users list.
     *
     * @return arrayList<>
     */
    public ArrayList<User> getUsersList() {
        return usersList;
    }

    /**
     * Receive a ArrayList<User> in order to ser users list
     *
     * @param usersList
     */
    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    /**
     * Return musics list.
     *
     * @return
     */
    public ArrayList<Music> getMusicsList() {
        return musicsList;
    }

    /**
     * Receives a ArrayList<Music> in order to set musics list.
     *
     * @param musicsList
     */
    public void setMusicsList(ArrayList<Music> musicsList) {
        this.musicsList = musicsList;
    }

    /**
     * Receives one User and add him to the usersList.
     *
     * @param u
     */
    public void addUser(User u) {
        usersList.add(u);
    }

    /**
     * Receives one User in order to remove him from the users list.
     *
     * @param u
     */
    public void removeUser(User u) {
        usersList.remove(u);
    }

    /**
     * Receives one Music in order to add her to the musics list.
     *
     * @param m
     */
    public void addMusic(Music m) {
        musicsList.add(m);
    }

    /**
     * Receives one Music in order to remover her from the musics list.
     *
     * @param m
     */
    public void removeMusic(Music m) {

        musicsList.remove(m);
    }

    /**
     * Receives one e-mail and use it to find a User. If the user is in the list
     * returns User, else returns null.
     *
     * @param email
     * @return
     */
    public User getUserWithEmail(String email) {
        User u = null;
        boolean encontrado = false;

        for (int i = 0; i < usersList.size() && !encontrado; i++) {

            if (usersList.get(i).getEmail().equals(email)) {

                u = usersList.get(i);
            }
        }

        return u;
    }

    /**
     * Gets the validation of a text field. If true is because is something
     * write, if false text field is empty.
     *
     * @param str
     * @return
     */
    public boolean validateName(String str) {
        return !str.isEmpty();
    }

    /**
     *
     * @param str string to validate a positive number.
     * @return Returns true if a string is a number. False otherwise.
     */
    public boolean validateInt(String str) {
        int i = -1;
        boolean validate;
        try {
            i = Integer.parseInt(str);
            validate = true;
        } catch (NumberFormatException nfe) {
            validate = false;
        }
        if (i < 0) {
            validate = false;
        }
        return validate;
    }

    /**
     * Search in the users list, for each user search the playlist list to find
     * public playlists and return one list with all the public playlists.
     *
     * @return
     */
    public ArrayList<Playlist> publicPlaylists() {

        ArrayList<Playlist> pubPlaylists = new ArrayList();

        for (int i = 0; i < usersList.size(); i++) {

            for (int j = 0; j < usersList.get(i).getPlaylists().size(); j++) {

                if (usersList.get(i).getPlaylists().get(j).getShared()) {

                    pubPlaylists.add(usersList.get(i).getPlaylists().get(j));
                }
            }
        }

        return pubPlaylists;
    }

    /**
     *
     * @param str string to validate a date year.
     * @return Returns true if a string is a valid year. False otherwise.
     */
    public boolean validateDate(String str) {
        boolean validate = false;
        Calendar year = Calendar.getInstance();
        year.setLenient(false);
        if (validateInt(str) && Integer.parseInt(str) > 1900 && Integer.parseInt(str) <= year.get(Calendar.YEAR)) {
            try {
                year.set(Calendar.YEAR, Integer.parseInt(str));
                year.getTime();
                validate = true;
            } catch (NumberFormatException nfe) {
                validate = false;
            }
        }
        return validate;
    }

    /**
     * Copy a file to a target file.
     *
     * @param source the path to the file to copy
     * @param target
     */
    public void copy(String source, String target) {
        try {
            File f1 = new File(source);
            File f2 = new File(target);
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException ex) {
            System.out.println("Exception occurred when copying a mp3 file. " + ex);
        }
    }//copia ficheiro para pasta audio do projecto

    /**
     *
     * @param container
     * @param ext1
     * @param ext2
     * @return
     */
    public File chooseFiles(JDialog container, String ext1, String ext2) {
        File file = null;
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter f1 = new FileNameExtensionFilter(ext1.toUpperCase() + " file", ext1, ext1);//só mostra ficheiros do tipo ext1 e ext2
        FileNameExtensionFilter f2 = new FileNameExtensionFilter(ext2.toUpperCase() + " file", ext2, ext2);
        fc.addChoosableFileFilter(f1);
        fc.addChoosableFileFilter(f2);
        fc.setMultiSelectionEnabled(false);//apenas pode selecionar um ficheiro de cada vez
        fc.setFileFilter(f1);//chamamos o set file filter ao objecto criado
        fc.setFileFilter(f2);//chamamos o set file filter ao objecto criado
        int opcao = fc.showOpenDialog(container); //abrimos a janela de diálogo para escolher o ficheiro
        if (opcao == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();//vai buscar o ficheiro 
        }
        return file;
    }

    /**
     * Print a list of Music objects type
     */
    public void listMusics() {
        for (Music m : musicsList) {
            System.out.println(m);
        }
    }

    /**
     * Print a list of User objects type
     */
    public void listUsers() {
        for (User u : usersList) {
            System.out.println(u);
        }
    }

    public Music musicaEscolhida(String nome, String album) {
	Music mus=new Music();
        for (Music m : musicsList) {
            if (m.getName().equalsIgnoreCase(nome) && m.getAlbum().equalsIgnoreCase(album)) {
            		mus=m;
            }
        }
        return mus;
    }
    
    
}
