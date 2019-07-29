package ie.cian.domain;

public class Song {

	String songName;
	int songId;
	
	public int getSongId() {
		return songId;
	}

	public void setSongId(int songID) {
		this.songId = songID;
	}

	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	
	public Song(String songName, int id) {
		super();
		this.songName = songName;
		this.songId = id;
	}
	
	public Song(String songName) {
		super();
		this.songName = songName;
	}
	
	public Song() {
		
	}

	@Override
	public String toString() {
		return  songName;
	}
	
	
}
