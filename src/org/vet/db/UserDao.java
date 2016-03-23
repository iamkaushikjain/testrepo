package org.vet.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.vet.entity.User;



public class UserDao
{
	public String FindUser(User u)
	{
		String role=null;
		String sql="select role,username from user where username=? and password=?";
		Connection conn=DBConnectionManager.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.execute();
			
			ResultSet rs=ps.executeQuery();
			while(rs!=null && rs.next())
			{
				role=rs.getString(1);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return role;
	}
}




