package projectogetplay;
import java.util.*;


public class User {
	protected String name;
	protected String email;
	protected String password;
	protected ArrayList<Playlist> playlists;
	public Playlist unnamed_Playlist_;
	public GetPlay unnamed_GetPlay_;
	public Playlist unnamed_Playlist_2;

	public User(String aNome, String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public User() {
	}

	public String getNome() {
		throw new UnsupportedOperationException();
	}

	public void setNome(String aNome) {
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String aEmail) {
		this.email = aEmail;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public ArrayList<Playlist> getPlaylists() {
		throw new UnsupportedOperationException();
	}

	public void setPlaylists(ArrayList<Playlist> aPlaylists) {
		throw new UnsupportedOperationException();
	}

	public void addPlaylist(Playlist aP) {
		throw new UnsupportedOperationException();
	}

	public void removePlaylist(Playlist aP) {
		throw new UnsupportedOperationException();
	}
}