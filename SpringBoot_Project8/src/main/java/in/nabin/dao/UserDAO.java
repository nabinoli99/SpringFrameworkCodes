package in.nabin.dao;

import in.nabin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO
{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
//	public boolean insertUser(User user)
//	{
//		boolean status = false;
//		try
//		{
//			String INSERT_SQL_QUERY = "INSERT INTO USERS (name,email,gender,city) VALUES (?,?,?,?)";
//			int count = jdbctemplate.update(INSERT_SQL_QUERY, user.getName(), user.getEmail(), user.getGender(), user.getCity());
//
//			if(count>0)
//			{
//				status = true;
//			}
//			else
//			{
//				status = false;
//			}
//		} catch (Exception e)
//		{
//			status = false;
//			e.printStackTrace();
//		}
//        return status;
//    }

//	public boolean UpdateUser(User user)
//	{
//		boolean status = false;
//		try
//		{
//			String UPDATE_SQL_QUERY = "UPDATE USERS SET name = ? , gender = ? , city= ? WHERE email = ?";
//			int count = jdbctemplate.update(UPDATE_SQL_QUERY, user.getName(), user.getGender(), user.getCity(), user.getEmail());
//       if(count >0)
//	   {
//		   status = true;
//	   }
//	   else
//	   {
//		   status = false;
//	   }
//		}
//		catch (Exception e)
//			{
//				status = false;
//			e.printStackTrace();
//		}
//		return status;
//





	public boolean DeleteUserByEmail(String email)
	{
		boolean status = false;
		try
		{
			String DElETE_SQL_QUERY = "DELETE FROM USERS WHERE email = ?";
			int count = jdbctemplate.update(DElETE_SQL_QUERY,email);
			if(count >0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch (Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}




	
}
