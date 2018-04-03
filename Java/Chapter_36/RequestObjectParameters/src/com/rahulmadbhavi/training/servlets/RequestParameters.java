
package com.rahulmadbhavi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestParameters extends HttpServlet
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
		Enumeration<String> params = request.getParameterNames();
		String name;
		String value;
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = null;
		
		try
		{
			printWriter = response.getWriter();
			
			printWriter.println("<html>");
			
			printWriter.println("<head>");
			printWriter.println("<title>Parameters</title>");
			printWriter.println("</head>");
			
			printWriter.println("<body>");
			
			printWriter.println("<table border=\"1\">");
				
			printWriter.println("<tr><td>Parameter Name</td><td>Parameter Value</td></tr>");
			
			while(params.hasMoreElements())
			{
				name = (String) params.nextElement();
				value = request.getParameter(name);
				
				printWriter.println("<tr>");
				printWriter.println("<td>" + name + "</td>");
				printWriter.println("<td>" + value + "</td>");
				printWriter.println("</tr>");
			}			
			
			printWriter.println("</table>");
			
			printWriter.println("</body>");
			
			printWriter.println("</html>");
		}
		catch(IOException e)
		{
			sendErrorRedirect(response);
		}
		finally
		{
			if(printWriter != null)
			{
				printWriter.close();
			}
			else
			{
				sendErrorRedirect(response);
			}
		}	
	}
}
