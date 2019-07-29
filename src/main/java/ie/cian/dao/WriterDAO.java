package ie.cian.dao;

import java.util.List;

import ie.cian.domain.Song;
import ie.cian.domain.Writer;

public interface WriterDAO {

	public List<Writer> findAll();
	public Writer findById(int writerId);
	List<Song> findWriterSong(int writerId);
	public void save(String newWriter);
}
