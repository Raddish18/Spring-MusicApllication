package ie.cian.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cian.dao.SongDAO;
import ie.cian.domain.Artist;
import ie.cian.domain.Song;
import ie.cian.domain.Writer;

@Service
public class SongServiceImplementation implements SongService {
	
	@Autowired
	SongDAO songDao;
	
	@Override
	public List<Song> getAllSongs(){
		return songDao.findAll();
	}
	
	@Override
	public Song getSongById(int songId) {
		return songDao.findById(songId);
	}
	
	@Override
	public List<Artist> songArtist(int artistId){
		return songDao.findSongArtist(artistId);
	}
	@Override
	public List<Writer> songWriter(int writerId){
		return songDao.findSongWriter(writerId);
	}

	@Override
	public void saveNew(String name) {
		songDao.save(name);
	}
}
