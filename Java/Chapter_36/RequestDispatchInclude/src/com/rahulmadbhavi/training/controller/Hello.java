package com.rahulmadbhavi.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String name = request.getParameter("name");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<H2>Hello " + name + "</H2><br>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/date");
		rd.include(request, response);
		
		out.println("Last line added by hello servlet.");		
	}
}
