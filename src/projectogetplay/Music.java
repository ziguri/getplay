package projectogetplay;

import java.io.Serializable;

public class Music implements Serializable {

    protected String name;
    protected String author;
    protected String album;
    protected int year;
    protected String musicPath;
    protected boolean favorite;
    protected String creatorEmail;

    public Music(String aName, String aAuthor, String aAlbum, int aYear, String aMusicPath, String aCreatorEmail) {
        this.name = aName;
        this.author = aAuthor;
        this.album = aAlbum;
        this.year = aYear;
        this.creatorEmail = aCreatorEmail;
        this.favorite = false;
        this.musicPath = aMusicPath;
    }

    public Music() {

    }

    /**
     * Return music name.
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Receive a String in order to set music name.
     *
     * @param aName
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * Return music author.
     *
     * @return String
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Receive a String in order to set music author.
     *
     * @param aAuthor
     */
    public void setAuthor(String aAuthor) {
        this.author = aAuthor;
    }

    /**
     * Return music path.
     *
     * @return String
     */
    public String getMusicPath() {
        return this.musicPath;
    }

    /**
     * Receive String in order to set music path.
     *
     * @param aMusicPath
     */
    public void setMusicPath(String aMusicPath) {
        this.musicPath = aMusicPath;
    }

    /**
     * Return music album.
     *
     * @return
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * Receive a String in order to set music album
     *
     * @param aAlbum
     */
    public void setAlbum(String aAlbum) {
        this.album = aAlbum;
    }

    /**
     * Return year of the music.
     *
     * @return int
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Receive int, in order to set the year of the music.
     *
     * @param aYear
     */
    public void setYear(int aYear) {
        this.year = aYear;
    }

    /**
     * Return true if the music is favorite, and false if is not.
     *
     * @return boolean
     */
    public boolean isFavorite() {
        return favorite;
    }

    /**
     * Receive a boolean in order to set music favorite.
     *
     * @param favorite
     */
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    /**
     * Return music creator e-mail.
     *
     * @return String
     */
    public String getCreatorEmail() {
        return this.creatorEmail;
    }

    /**
     * Receive a String in order to set music creator e-mail
     *
     * @param aCreatorEmail
     */
    public void setCreatorEmail(String aCreatorEmail) {
        this.creatorEmail = aCreatorEmail;
    }

    @Override
    public String toString() {
        return "Music{ " + name + ", " + author + ", " + album + ", " + year + ", " + musicPath + ", " + creatorEmail + '}';
    }

}
