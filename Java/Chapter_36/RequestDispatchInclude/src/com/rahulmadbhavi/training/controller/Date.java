package com.rahulmadbhavi.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Date extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss.SSS");
		String dateString = sdf.format(date);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("Time : " + dateString + "<br>");
		
		out.println("Last line added by date servlet.<br>");	
	}
}
