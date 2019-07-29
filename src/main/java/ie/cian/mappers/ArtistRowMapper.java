package ie.cian.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import ie.cian.domain.Artist;

public class ArtistRowMapper implements RowMapper<Artist> {

	@Override
	public Artist mapRow(ResultSet r, int rowNum) throws SQLException{
		Artist a = new Artist();
		a.setArtistName(r.getString("artistName"));
		a.setArtistId(r.getInt("artistId"));
		return a;
	}
}
