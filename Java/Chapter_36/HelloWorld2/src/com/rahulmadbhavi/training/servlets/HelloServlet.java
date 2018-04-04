
package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public HelloServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");

		PrintWriter printWriter = response.getWriter();
				
		printWriter.println("<html>");
		printWriter.println("<head></head>");
		printWriter.println("<body>");
		printWriter.println("Hi!");
		printWriter.println("</body>");
		printWriter.println("</html>");
		
		printWriter.close();
	}
}