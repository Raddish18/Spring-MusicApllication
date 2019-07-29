package ie.cian.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cian.domain.Song;
import ie.cian.domain.Writer;
import ie.cian.mappers.SongRowMapper;
import ie.cian.mappers.WriterRowMapper;

@Repository
public class WriterDaoImp implements WriterDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Writer> findAll() {
		String sql = "Select * from writer";
		List<Writer>writer = jdbcTemplate.query(sql,new WriterRowMapper());
		return writer;
	}

	@Override
	public Writer findById(int writerId) {
		String sql = "Select * from writer where writerId = ?";
		Writer writer = jdbcTemplate.queryForObject(sql, new WriterRowMapper(), writerId);
		return writer;
	}

	@Override
	public void save(String writerName) {
		String sql = "INSERT INTO writer(writerName) VALUES(?)";
		jdbcTemplate.update(sql, new Object[] {writerName});
		
	}

	@Override
	public List<Song> findWriterSong(int writerId) {
		String sql = "Select * from song JOIN writerInfo ON song.songId=writerInfo.writerId AND writerInfo.songId=?";
		List<Song> writerSong = jdbcTemplate.query(sql, new SongRowMapper(),writerId);
		return writerSong;
	}
}
