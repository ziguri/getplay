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
    
    /**
     * Receives one User and add him to the usersList.
     * @param u 
     */
    public void addUser(User u){
    
        usersList.add(u);
    }
    
    /**
     * Receives one User in order to remove him from the users list.
     * @param u 
     */
    public void removeUser(User u){
    
        usersList.remove(u);
    }
    
    /**
     * Receives one Music in order to add her to the musics list.
     * @param m 
     */
    public void addMusic(Music m){
    
        musicsList.add(m);
    }
    
    /**
     * Receives one Music in order to remover her from the musics list.
     * @param m 
     */
    public void removeMusic(Music m){
    
        musicsList.remove(m);
    }
    
    /**
     * Receives one e-mail and use it to find a User. If the user is in the list
     * returns User, else returns null.
     * @param email
     * @return 
     */
    public User getUserWithEmail(String email){
    
        User u=null;
        boolean encontrado=false;
        
        for(int i=0; i<usersList.size() && !encontrado; i++){
        
            if(usersList.get(i).getEmail().equals(email)){
            
                u=usersList.get(i);
            }
        }
        
        return u;
    }

}