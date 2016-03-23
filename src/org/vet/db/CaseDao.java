package org.vet.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.vet.entity.Case;

public class CaseDao 
{
	ResultSet keyset;
	public int CreateCase(Case c)
	{
		String sql="insert into vet_case (description,symptoms,status) values(?,?,?)";
		int row=0;
		int key=0;
		Connection conn=DBConnectionManager.getConnection();
		
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getDescription());
			ps.setString(2, c.getSymptoms());
			ps.setString(3, c.getStatus());
			
			row=ps.executeUpdate();
			keyset=ps.getGeneratedKeys();
			while(keyset!=null && keyset.next())
			{
				key=keyset.getInt(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return key;
	}
	
}
