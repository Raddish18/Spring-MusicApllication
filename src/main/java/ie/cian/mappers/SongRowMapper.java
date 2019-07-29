package ie.cian.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cian.domain.Song;

public class SongRowMapper implements RowMapper<Song> {

	@Override
	public Song mapRow(ResultSet r, int rowNum) throws SQLException{
		Song s = new Song();
		s.setSongName(r.getString("songName"));
		s.setSongId(r.getInt("songId"));
		return s;
	}
}
