package projectogetplay;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {

    private static final long serialVersionUID = 3901859968848387462L;
    protected String name;
    protected String email;
    protected String password;
    protected ArrayList<Playlist> playlists;

    
    public User(String aName, String aEmail, String aPassword) {
        this.name = aName;
        this.email = aEmail;
        this.password = aPassword;
        this.playlists = new ArrayList();
    }

    public User() {
    }
    
    /**
     * Verify if exist another playlist with the same name.
     * @param name
     * @return 
     */
    public boolean existPlaylist(String name){
    
        boolean exist=false;
        
        for(int i=0; i<playlists.size() && !exist; i++){
        
            if(playlists.get(i).getName().equalsIgnoreCase(name)){
            
                exist=true;
            }
        }
        
        return exist;
    }
    
    public Playlist getPlaylistByName(String name){
    
        Playlist p=null;
        
        for(int i=0; i<playlists.size(); i++){
        
            if(playlists.get(i).getName().equalsIgnoreCase(name)){
            
                p=playlists.get(i);
            }
        }
        
        return p;
    }

    /**
     * Search playlist list by name and return his index.
     * @param nome
     * @return 
     */
    public int getIndexPlaylist (String nome){
    
        int index=0;
        for(int i=0; i<playlists.size(); i++){
        
            if(playlists.get(i).getName().equalsIgnoreCase(nome)){
            
                index=i;
            }
        }
        
        return index;
    }
    /**
     * Return user e-mail.
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Receive a String with e-mail, and set user e-mail.
     *
     * @param aEmail
     */
    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    /**
     * Return encrypted user password.
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Receive a String encrypted password and set the user password;
     *
     * @param aPassword
     */
    public void setPassword(String aPassword) {
        this.password = aPassword;
    }

    /**
     * Return user name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Receive a String with name, and set de user name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return playlist list.
     *
     * @return ArrayList<>
     */
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * Receive playlists list to set user playlists list.
     *
     * @param playlists
     */
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    /**
     *
     * @return Returns true if user is authenticate. False otherwise.
     */
    public void addNewPlaylist(Playlist novo) {
        playlists.add(novo);

    }

    public void removePlaylist(Playlist novo) {
        playlists.remove(novo);

    }

    public void removeALLPlaylist() {
        playlists.removeAll(playlists);
    }
    
    /**
     * Search in playlist list by name in order to find and return the playlist
     * whit the same name.
     * @param nome
     * @return 
     */
    public Playlist findPlaylist(String nome){
    
        Playlist pl = null;
        
        for(int i=0; i<playlists.size(); i++){
        
            if(playlists.get(i).getName().equals(nome)){
            
                pl=playlists.get(i);
            }
        }
        
        return pl;
    }

    @Override
    public String toString() {
        return "User{ " + name + ", " + email + ", " + password + ", " + playlists + '}';
    }

}
