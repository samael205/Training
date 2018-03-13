
package com.rahulmadbhavi.application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rahulmadbhavi.utility.JDBCConnector;

public class App
{
	public static void main(String args[])
	{
		Connection connection = JDBCConnector.createConnection();
		
		try
		{
			Statement statement = connection.createStatement();
			
			String query = "update employees set gender='F' where emp_no=10067";

			int updated = statement.executeUpdate(query);
			
			System.out.println("Number of rows updated : " + updated);
			
			statement.close();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}					
	}
}
