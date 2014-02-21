package projectogetplay;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Aires
 */
public class Playlist implements Serializable {

    private static final long serialVersionUID = 3901859968848387462L;
    protected String name;
    protected ArrayList<Integer> musics;
    protected GregorianCalendar dateCreation;
    protected boolean shared;
    

    public Playlist(String aName) {
        this.name = aName;
        dateCreation = new GregorianCalendar();
        this.musics = new ArrayList();
        
    }

    /**
     * Get the Playlist name
     *
     * @return name of the playlist
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set a new Playlist name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * Get the List of Music of the Playlist
     * @return a List of Music
     */
    public ArrayList<Integer> getMusics() {
        return musics;
    }

    /**
     * Set a new List of Music of the Playlist
     *
     * @param aMusics List of Music
     */
    public void setMusics(ArrayList<Integer> aMusics) {
        this.musics.clear();
        this.musics.addAll(aMusics);
    }

    /**
     * Get the date this PlayList creation.
     *
     * @return date date of PlayList creation;
     */
    public GregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Alter the date, of the PlayList creation
     *
     * @param aDateCreation date
     */
    public void setDateCreation(GregorianCalendar aDateCreation) {
        this.dateCreation = aDateCreation;
    }

    /**
     * Return, if a Playlist is a public domain or not
     *
     * @return True if the playlist is a public domain, false if not;
     */
    public boolean getShared() {
        return this.shared;
    }

    /**
     * Set playlist is a public domain
     *
     * @param aShared
     */
    public void setShared(boolean aShared) {
        this.shared = aShared;
    }

    /**
     * Add a music in a Playlist
     *
     * @param m music
     */
    public void addMusicPlaylist(int m) {
        musics.add(m);
    }

    /**
     * Remove a music from the Playlist
     *
     * @param m Music to remove
     */
    public void removeMusicPlaylist(Music m) {
        musics.remove(m);
    }

    /**
     * Removes a music in a playlist by Array index
     *
     * @param item index
     */
    public void removeMusicPlaylistItem(int item) {
        musics.remove(item);
    }

    /**
     * Transform a Gregorian Calendar in string format
     *
     * @return date in String type
     */
    public String getdateCreationString() {

        return getDateCreation().get(Calendar.DAY_OF_MONTH) + "/"
                + getDateCreation().get(Calendar.MONTH) + "/"
                + getDateCreation().get(Calendar.YEAR);
    }

    /**
     * Verify if the Music exist in the Playlist
     *
     * @param musicCode
     * @return true if Music exists in the ArrayList, false if not
     */
    public boolean existeMusicPlaylist(int musicCode) {
        for (int music : musics) {
            if(music == musicCode){
                return true;
            }
        }

        return false;
    }
    
    private String sharedString(){
    
        if(shared){
        
            return "Yes";
        }else{
        
            return "false";
        }
    }

    /**
     *
     * @return number of music in this playlist
     */
    public int getSize() {
        return musics.size();
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
