package com.rahulmadbhavi.training.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Request extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Cookie cookie1 = new Cookie("username", "test");
		Cookie cookie2 = new Cookie("name", "testing");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);			
	}
}
