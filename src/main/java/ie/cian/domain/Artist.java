package ie.cian.domain;

public class Artist {

	String artistName;
	int artistId;
	
	public Artist(String artistName, int artistId) {
		super();
		this.artistName = artistName;
		this.artistId = artistId;
	}
	public Artist() {
	}
	
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	
	@Override
	public String toString() {
		return  artistName;
	}
}
