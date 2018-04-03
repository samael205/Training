package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestObjectInfo extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Get writer for response
		PrintWriter out = response.getWriter();
		
		// Set content type
		response.setContentType("text/html");
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Request Info</title>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<table border='1'>");
		
		out.println("<tr>");
		out.println("<td>Method</td>");
		out.println("<td>" + request.getMethod() + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Request URI</td>");
		out.println("<td>" + request.getRequestURI() + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Protocol</td>");
		out.println("<td>" + request.getProtocol() + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Path Info</td>");
		out.println("<td>" + request.getPathInfo() + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Remote Address</td>");
		out.println("<td>" + request.getRemoteAddr() + "</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		out.println("</body>");
		
		out.println("</html>");
	}
}
