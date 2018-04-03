package com.rahulmadbhavi.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		ServletContext context = getServletContext();
		
		String name = context.getInitParameter("name");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Servlet Context</title></head>");
		out.println("<body>");
		out.println("Name : " + name);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
