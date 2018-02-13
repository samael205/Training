
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		char ch;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter characters 'q' to quit");

		// Read characters
		do
		{
			ch = (char) bufferedReader.read();
			System.out.println(ch);
		
		}while(ch != 'q');
	}
}