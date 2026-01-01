package in.nabin.dao;

import in.nabin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;

	// ---------------- INSERT ----------------
//	public boolean insertUser(User user) {
//		boolean status = false;
//		try {
//			String INSERT_SQL_QUERY = "INSERT INTO USERS (name,email,gender,city) VALUES (?,?,?,?)";
//			int count = jdbctemplate.update(INSERT_SQL_QUERY,
//					user.getName(),
//					user.getEmail(),
//					user.getGender(),
//					user.getCity());
//			status = count > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}

	// ---------------- UPDATE ----------------
	public boolean UpdateUser(User user) {
		boolean status = false;
		try {
			String UPDATE_SQL_QUERY = "UPDATE USERS SET name = ? , gender = ? , city= ? WHERE email = ?";
			int count = jdbctemplate.update(UPDATE_SQL_QUERY,
					user.getName(),
					user.getGender(),
					user.getCity(),
					user.getEmail());
			status = count > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	// ---------------- DELETE ----------------
//	public boolean DeleteUserByEmail(String email) {
//		boolean status = false;
//		try {
//			String DELETE_SQL_QUERY = "DELETE FROM USERS WHERE email = ?";
//			int count = jdbctemplate.update(DELETE_SQL_QUERY, email);
//			status = count > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}

	// ---------------- READ ----------------
	public User getUserByEmail(String email) {
		String SELECT_SQL_QUERY = "SELECT * FROM USERS WHERE email = ?";
		List<User> users = jdbctemplate.query(SELECT_SQL_QUERY, new UserRowMapper(), email);
		return users.isEmpty() ? null : users.get(0);
	}
    public List<User> getAllUsers()
	{
		String SELECT_SQL_QUERY = "SELECT * FROM USERS";
		return jdbctemplate.query(SELECT_SQL_QUERY,new UserRowMapper());
	}
	// ---------------- ROW MAPPER ----------------
	private static final class UserRowMapper implements RowMapper<User> {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			return user;
		}
	}
}
