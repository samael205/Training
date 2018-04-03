package com.rahulmadbhavi.training.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahulmadbhavi.training.utility.DatabaseConnector;

public class GetEmployees extends HttpServlet
{
	private void sendErrorRedirect(HttpServletResponse response)
	{
		try
		{
			response.sendRedirect("html/error.html");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			Connection connection = DatabaseConnector.createConnection();

			if(connection != null)
			{
				Statement statement = connection.createStatement();
				
				String query = "select * from employees limit 1000";
				
				ResultSet resultSet = statement.executeQuery(query);
				
				PrintWriter out = response.getWriter();
				
				response.setContentType("text/html");
				
				out.println("<html>");
				
				out.println("<head>");
				out.println("<title>Employees</title>");
				out.println("</head>");
				
				out.println("<body>");
				
				out.println("<table border='1'>");
				
				out.println("<thead>");
				out.println("<tr>");
				out.println("<th>Employee Number</th>");
				out.println("<th>First Name</th>");
				out.println("<th>Last Name</th>");
				out.println("<th>Gender</th>");
				out.println("<th>Birth Date</th>");
				out.println("<th>Hire Date</th>");
				out.println("</tr>");
				out.println("</thead>");
				
				out.println("<tbody>");
				
				while(resultSet.next())
				{
					out.println("<tr>");
					out.println("<td>" + resultSet.getString("emp_no") + "</td>");
					out.println("<td>" + resultSet.getString("first_name") + "</td>");
					out.println("<td>" + resultSet.getString("last_name") + "</td>");
					out.println("<td>" + resultSet.getString("gender") + "</td>");
					out.println("<td>" + resultSet.getDate("birth_date") + "</td>");
					out.println("<td>" + resultSet.getDate("hire_date") + "</td>");
					out.println("</tr>");
				}
				
				out.println("</tbody>");
				
				out.println("</table>");
				
				out.println("</body>");
				
				out.println("</html>");
			}
			else
			{
				sendErrorRedirect(response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			sendErrorRedirect(response);
		}
	}
}
