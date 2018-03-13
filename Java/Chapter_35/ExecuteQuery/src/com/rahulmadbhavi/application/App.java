
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
			
			String query = "select * from employees LIMIT 10";

			ResultSet resultSet = statement.executeQuery(query);
			
			int empNo;
			Date birthDate;
			String firstName;
			String lastName;
			String gender;
			Date hireDate;
			
			int count = 1;
			
			while(resultSet.next())
			{
				empNo = resultSet.getInt("emp_no");
				birthDate = resultSet.getDate("birth_date");
				firstName = resultSet.getString("first_name");
				lastName = resultSet.getString("last_name");
				gender = resultSet.getString("gender");
				hireDate = resultSet.getDate("hire_date");
				
				System.out.println("Record " + (count++));
				System.out.println("Employee Number : " + empNo);
				System.out.println("Birth Date      : " + birthDate);
				System.out.println("First Name      : " + firstName);
				System.out.println("Last Name       : " + lastName);
				System.out.println("Gender          : " + gender);
				System.out.println("Hire Date       : " + hireDate);
				System.out.println("");
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
