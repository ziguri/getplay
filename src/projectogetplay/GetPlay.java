package projectogetplay;
import java.util.*;

public class GetPlay {
	protected ArrayList<User> usersList;
	protected ArrayList<Music> musicsList;

	public GetPlay() {
		
	}

    /**
     * Return users list.
     * @return arrayList<>
     */
    public ArrayList<User> getUsersList() {
        return usersList;
    }

    /**
     * Receive a ArrayList<User> in order to ser users list
     * @param usersList 
     */
    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    /**
     * Return musics list.
     * @return 
     */
    public ArrayList<Music> getMusicsList() {
        return musicsList;
    }

    /**
     * Receives a ArrayList<Music> in order to set musics list.
     * @param musicsList 
     */
    public void setMusicsList(ArrayList<Music> musicsList) {
        this.musicsList = musicsList;
    }

}