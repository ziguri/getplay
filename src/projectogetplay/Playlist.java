package projectogetplay;

import java.util.*;

public class Playlist {

    protected String name;
    protected ArrayList<Music> musics;
    protected GregorianCalendar dateCreation;
    protected boolean shared;
    public User unnamed_User_;
    public Music unnamed_Music_;
    public GetPlay unnamed_GetPlay_;
    public User unnamed_User_2;
    public Music unnamed_Music_2;

    public Playlist(String aName, User aCreator, GregorianCalendar aDateCreation) {
       
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public ArrayList<Music> getMusics() {
        throw new UnsupportedOperationException();
    }

    public void setMusics(ArrayList<Music> aMusics) {
        throw new UnsupportedOperationException();
    }

    public GregorianCalendar getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(GregorianCalendar aDateCreation) {
        this.dateCreation = aDateCreation;
    }

    public boolean getShared() {
        return this.shared;
    }

    public void setShared(boolean aShared) {
        this.shared = aShared;
    }

        // metodo para o PlayList.java
    public String getdateCreationString() {

        return getDateCreation().get(Calendar.DAY_OF_MONTH) + "/"
                + getDateCreation().get(Calendar.MONTH) + "/"
                + getDateCreation().get(Calendar.YEAR);
    }

// metodo para o PlayList.java
    public int getSize() {
        return musics.size();
    }

}
