package ie.cian.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;
import ie.cian.mappers.ArtistRowMapper;
import ie.cian.mappers.SongRowMapper;

@Repository
public class ArtistDaoImp implements ArtistDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Artist> findAll() {
		String sql = "Select * from artist";
		List<Artist>artist = jdbcTemplate.query(sql,new ArtistRowMapper());
		return artist;
	}

	@Override
	public Artist findById(int artistId) {
		String sql = "Select * from song where songId = ?";
		Artist artist = jdbcTemplate.queryForObject(sql, new ArtistRowMapper(), artistId);
		return artist;
	}
	
	@Override
	public List<Song> findArtistSong(int artistId){
		String sql = "Select * from song JOIN artistInfo ON song.songId=artistInfo.artistId AND artistInfo.songId=?";
		List<Song> artistSong = jdbcTemplate.query(sql, new SongRowMapper(),artistId);
		return artistSong;
	}

	@Override
	public void save(String artistName) {
		String sql = "INSERT INTO artist(artistName) VALUES(?)";
		jdbcTemplate.update(sql, new Object[] {artistName});
		
	}

}
