package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSelect extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String state = request.getParameter("state");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Reading Form Data</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("You selected : " + state + ".");
		out.println("</body>");
		
		out.println("</html>");
		
		out.close();
	}
}
