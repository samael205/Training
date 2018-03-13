
package com.rahulmadbhavi.application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
			
			String query = "select emp_no as 'Employee Number', birth_date as 'Birth Date', first_name as 'First Name', last_name as 'Last Name', gender as 'Gender', hire_date as 'Hire Date' from employees LIMIT 10";

			ResultSet resultSet = statement.executeQuery(query);

			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			
			System.out.println("Columns Information");
			for(int i=1; i<=resultSetMetaData.getColumnCount(); i++)
			{
				System.out.println("Index " + i);
				
				System.out.println("Column Name  : " + resultSetMetaData.getColumnName(i));
				System.out.println("Column Label : " + resultSetMetaData.getColumnLabel(i));
				System.out.println("Column Type  : " + resultSetMetaData.getColumnType(i));
				System.out.println("Column Type  : " + resultSetMetaData.getColumnTypeName(i));
				
				System.out.println();
			}
			
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}					
	}
}
