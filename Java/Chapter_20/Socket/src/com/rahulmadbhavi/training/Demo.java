
package com.rahulmadbhavi.training;

import java.io.*;
import java.net.*;

class Demo
{
	public static void main(String args[]) throws Exception
	{
		int c;

		// Create a socket connected to internic.net, port 43
		Socket socket = new Socket("whois.internic.net", 43);

		// Obtain input and output streams
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();

		// Construct a request string
		String string = (args.length == 0 ? "osborne.com" : args[0]) + "\n";

		// Convert to bytes
		byte buf[] = string.getBytes();

		// Send request
		out.write(buf);

		// Read and display response
		while((c = in.read()) != -1)
		{
			System.out.print((char) c);
		}

		System.out.println();

		socket.close();
	}
}