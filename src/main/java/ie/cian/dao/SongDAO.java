package ie.cian.dao;

import java.util.List;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;
import ie.cian.domain.Writer;

public interface SongDAO {

	public List<Song> findAll();
	public Song findById(int songId);
	public List<Artist> findSongArtist(int songId);
	public List<Writer> findSongWriter(int songId);
	void save(String songName);
}
