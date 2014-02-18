package projectogetplay;


public class Music {
	protected String name;
	protected String author;
	protected String album;
	protected int year;
	protected String musicPath;
	protected int classification;
	protected String creatorEmail;
	public Playlist unnamed_Playlist_;
	public GetPlay unnamed_GetPlay_;
	public GetPlay unnamed_GetPlay_2;
	public Playlist unnamed_Playlist_2;

	public Music(String aName, String aAuthor, String aAlbum, int aYear, String aMusicPath) {
		throw new UnsupportedOperationException();
	}

	public Music() {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String aAuthor) {
		this.author = aAuthor;
	}

	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String aMusicPath) {
		this.musicPath = aMusicPath;
	}

	public String getAlbum() {
		return this.album;
	}

	public void setAlbum(String aAlbum) {
		this.album = aAlbum;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int aYear) {
		this.year = aYear;
	}

	public int getClassification() {
		return this.classification;
	}

	public void setClassification(int aClassification) {
		this.classification = aClassification;
	}

	public String getCreatorEmail() {
		return this.creatorEmail;
	}

	public void setCreatorEmail(String aCreatorEmail) {
		this.creatorEmail = aCreatorEmail;
	}
}