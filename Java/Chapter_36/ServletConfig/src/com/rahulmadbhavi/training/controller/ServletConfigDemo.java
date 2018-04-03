package com.rahulmadbhavi.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet
{
	String homeName;
	ServletConfig config;
	
	public void init()
	{
		config = getServletConfig();		
		homeName = getInitParameter("homeName");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		out.println("<html>");
		
		out.println("<head><title>Servlet Config Demo</title></head>");
		
		out.println("<body>");
		out.println("<h2>" + homeName + "</h2>");
		out.println("<hr>");
		out.println("Hello " + name + "!");
		out.println("</body>");

		out.println("</html>");
	}
}
