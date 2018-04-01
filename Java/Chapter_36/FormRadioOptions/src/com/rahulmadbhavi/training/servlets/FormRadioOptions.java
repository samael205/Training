package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormRadioOptions extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String option = request.getParameter("option");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Reading Form Data</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("You selected : " + option + ".");
		out.println("</body>");
		
		out.println("</html>");
		
		out.close();
	}
}
