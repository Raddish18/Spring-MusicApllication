package ie.cian.services;

import java.util.List;

import ie.cian.domain.Song;
import ie.cian.domain.Writer;

public interface WriterService {

	List<Writer> getAllWriter();
	Writer getWriterById(int writerId);
	void saveNew(String newWriter);
	List<Song> writerSong(int inW);
}
