package projectogetplay;
import java.util.*;


public class Playlist {
	protected String name;
	protected ArrayList<Music> musics;
	protected GregorianCalendar dateCreation;
	protected boolean shared;
	

	public Playlist(String aName, GregorianCalendar aDateCreation) {
            
            this.name=aName;
            this.dateCreation=aDateCreation;
            this.musics=new ArrayList();
            this.shared=false;
		
	}

        /**
         * Return playlist name
         * @return String
         */
	public String getName() {
		return this.name;
	}

        /**
         * Receive a String to set the Playlist name
         * @param aName 
         */
	public void setName(String aName) {
		this.name = aName;
	}

        /**
         * Return ArrayList<Music>.
         * @return ArrayList.
         */
        public ArrayList<Music> getMusics() {
            return musics;
        }

        /**
         * Receive a ArrayList<Music> to set the musics list.
         * @param musics 
         */
        public void setMusics(ArrayList<Music> musics) {
            this.musics = musics;
        }

        /**
         * Return playlist date of creation.
         * @return 
         */
	public GregorianCalendar getDateCreation() {
		return this.dateCreation;
	}

        /**
         * Receive a GregorianCalendar to set playlist date of creation.
         * @param aDateCreation 
         */
	public void setDateCreation(GregorianCalendar aDateCreation) {
		this.dateCreation = aDateCreation;
	}
        
        /**
         * Return boolean getShared.
         * @return 
         */
	public boolean getShared() {
		return this.shared;
	}

        /**
         * Receive a boolean to set shred playlist.
         * @param aShared 
         */
	public void setShared(boolean aShared) {
		this.shared = aShared;
	}
}