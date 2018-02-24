
package com.rahulmadbhavi.training;

import java.net.*;
import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String args[]) throws Exception
	{
		URL url = new URL("http://www.google.com");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Display request method
		System.out.println("Request method is " + connection.getRequestMethod());

		// Display response code
		System.out.println("Response code is " + connection.getResponseCode());

		// Display response method
		System.out.println("Response message is " + connection.getResponseMessage());

		// Get a list of the header fields and a set of the header keys
		Map<String, List<String>> map = connection.getHeaderFields();
		Set<String> fields = map.keySet();

		System.out.println("\nHere is the header : ");

		// Display all header keys and values
		for(String k : fields)
		{
			System.out.println("Key: " + k + " , Value: " + map.get(k));
		}
	}
}