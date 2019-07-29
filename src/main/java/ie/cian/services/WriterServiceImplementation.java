package ie.cian.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cian.dao.WriterDAO;
import ie.cian.domain.Song;
import ie.cian.domain.Writer;

@Service
public class WriterServiceImplementation implements WriterService{

	@Autowired
	WriterDAO writerDao;
	
	@Override
	public List<Writer> getAllWriter() {
		return writerDao.findAll();
	}

	@Override
	public Writer getWriterById(int writerId) {
		return writerDao.findById(writerId);
	}

	@Override
	public void saveNew(String newWriter) {
		writerDao.save(newWriter);
	}

	@Override
	public List<Song> writerSong(int inW) {
		return writerDao.findWriterSong(inW);
	}
	

}
