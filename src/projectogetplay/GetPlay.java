package projectogetplay;
import java.util.*;

public class GetPlay {
	protected ArrayList<User> usersList;
	protected ArrayList<Music> musicsList;

	public GetPlay() {
		
	}

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public ArrayList<Music> getMusicsList() {
        return musicsList;
    }

    public void setMusicsList(ArrayList<Music> musicsList) {
        this.musicsList = musicsList;
    }

}