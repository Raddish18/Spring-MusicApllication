package ie.cian.services;

import java.util.List;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;

public interface ArtistService {

	List<Artist> getAllArtists();
	Artist getArtistById(int artistId);
	List<Song> artistSong(int songId);
	void saveNew(String name);
}
