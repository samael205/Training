package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHeaders extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		
		Enumeration<String> reqHeaders = request.getHeaderNames();
		String name;
		String value;
		
		response.setContentType("text/html");
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Request Headers</title>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<table border='1'>");
		while(reqHeaders.hasMoreElements())
		{
			name = reqHeaders.nextElement();
			value = request.getHeader(name);
			
			out.println("<tr>");
			out.println("<td>" + name + "</td>");
			out.println("<td>" + value + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		out.println("</body>");
		
		out.println("</html>");
	}
}
