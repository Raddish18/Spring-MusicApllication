package ie.cian.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cian.dao.ArtistDAO;
import ie.cian.domain.Artist;
import ie.cian.domain.Song;

@Service
public class ArtistServiceImplementation implements ArtistService {
	
	@Autowired
	ArtistDAO artistDao;
	
	@Override
	public List<Artist> getAllArtists(){
		return artistDao.findAll();
	}
	
	@Override
	public Artist getArtistById(int artistId) {
		return artistDao.findById(artistId);
	}

	@Override
	public void saveNew(String name) {
		artistDao.save(name);
		
	}

	@Override
	public List<Song> artistSong(int songId) {
		return artistDao.findArtistSong(songId);
	}
}
