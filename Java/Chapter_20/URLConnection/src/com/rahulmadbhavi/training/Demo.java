
package com.rahulmadbhavi.training;

import java.net.*;
import java.io.*;
import java.util.Date;

class Demo
{
	public static void main(String args[]) throws Exception
	{
		int c;
		URL url = new URL("http://www.internic.net");
		URLConnection urlConnection = url.openConnection();

		// Get date
		long d = urlConnection.getDate();

		if(d == 0)
		{
			System.out.println("No date information.");
		}
		else
		{
			System.out.println("Date : " + new Date(d));
		}

		System.out.println("Content-Type : " + urlConnection.getContentType());

		// Get Expiration date
		d = urlConnection.getExpiration();
		if(d == 0)
		{
			System.out.println("No expiration information.");
		}
		else
		{
			System.out.println("Expires : " + new Date(d));
		}

		// Get content length
		int length = urlConnection.getContentLength();
		if(length == -1)
		{
			System.out.println("Content length unavailable.");
		}
		else
		{
			System.out.println("Content-Length : " + length);
		}

		if(length != 0)
		{
			System.out.println("=== Content ===");
			InputStream input = urlConnection.getInputStream();

			int i = length;
			while((c = input.read()) != -1)
			{
				System.out.print((char) c);
			}

			System.out.println();

			input.close();
		}
		else
		{
			System.out.println("No content available.");
		}
	}
}