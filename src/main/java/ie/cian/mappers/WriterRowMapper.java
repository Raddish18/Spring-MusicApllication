package ie.cian.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cian.domain.Writer;

public class WriterRowMapper implements RowMapper<Writer> {

	@Override
	public Writer mapRow(ResultSet r, int rowNum) throws SQLException{
		Writer s = new Writer();
		s.setWriterName(r.getString("writerName"));
		s.setWriterId(r.getInt("writerId"));
		return s;
	}
}
