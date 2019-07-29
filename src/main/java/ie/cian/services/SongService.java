package ie.cian.services;

import java.util.List;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;
import ie.cian.domain.Writer;

public interface SongService {
	List<Song> getAllSongs();
	Song getSongById(int songId);
	List<Artist> songArtist(int artistId);
	List<Writer> songWriter(int writerId);
	void saveNew(String name);
}
