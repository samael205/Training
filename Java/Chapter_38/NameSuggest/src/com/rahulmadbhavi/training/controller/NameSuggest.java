
package com.rahulmadbhavi.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulmadbhavi.training.utility.DatabaseConnector;

public class NameSuggest extends HttpServlet
{
	private String generateContent(String firstName, String lastName)
	{
		StringBuilder result = new StringBuilder();

		Connection connection = DatabaseConnector.createConnection();

		if (connection != null)
		{
			try
			{
				Statement statement = connection.createStatement();
				
				String query = "select concat(first_name, ' ', last_name) as 'name' from employees where UPPER(first_name) like '" + firstName.toUpperCase() + "%' and UPPER(last_name) like '" + lastName.toUpperCase() + "%' order by name";
				
				ResultSet rs = statement.executeQuery(query);
				
				while(rs.next())
				{
					result.append(rs.getString("name"));
					result.append("<br>");
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
				result = new StringBuilder("Error During Database Fetching");
			}
		}

		return result.toString();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			String suggestion = "";

			// Fetch name
			String firstName = request.getParameter("firstname");
			String lastName = request.getParameter("lastname");

			// Create suggestion
			suggestion = generateContent(firstName, lastName);

			// Write to stream
			out.println(suggestion);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
