package ie.cian.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cian.domain.Artist;
import ie.cian.domain.Song;
import ie.cian.domain.Writer;
import ie.cian.mappers.ArtistRowMapper;
import ie.cian.mappers.SongRowMapper;
import ie.cian.mappers.WriterRowMapper;

@Repository
public class SongDaoImp implements SongDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Song> findAll() {
		String sql = "Select * from song";
		List<Song>songs = jdbcTemplate.query(sql,new SongRowMapper());
		return songs;
	}

	@Override
	public Song findById(int songId) {
		String sql = "Select * from song where songId = ?";
		Song song = jdbcTemplate.queryForObject(sql, new SongRowMapper(), songId);
		return song;
	}
	
	@Override
	public List<Artist> findSongArtist(int songId){
		String sql = "Select * from artist JOIN songArtist ON artist.artistId=songArtist.artistId AND songArtist.artistId=?";
		List<Artist> songArtist = jdbcTemplate.query(sql, new ArtistRowMapper(),songId);
		return songArtist;
	}
	
	@Override
	public List<Writer> findSongWriter(int songId){
		String sql = "Select * from writer JOIN songWriter ON writer.writerId=songWriter.writerId AND songWriter.writerId=?";
		List<Writer> songWriter = jdbcTemplate.query(sql, new WriterRowMapper(),songId);
		return songWriter;
	}
	
	@Override
	public void save(String songName) {
	String sql = "INSERT INTO song(songName) VALUES(?)";
	jdbcTemplate.update(sql, new Object[] {songName});
	}


}
