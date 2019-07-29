package ie.cian.dao;

import java.util.List;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;

public interface ArtistDAO {

	public List<Artist> findAll();
	public Artist findById(int artistId);
	void save(String artistName);
	List<Song> findArtistSong(int artistId);
}
