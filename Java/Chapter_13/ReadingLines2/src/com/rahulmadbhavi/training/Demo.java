
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strings[] = new String[100];

		System.out.println("Enter upto 100 lines of text.");
		System.out.println("(or enter 'stop' to quit)");

		int counter = 0;
		ReadLoop:
		do
		{
			strings[counter] = br.readLine();

			if(strings[counter].equals("stop"))
			{
				break ReadLoop;
			}

		}while(++counter < 100);

		System.out.println("\nHere's your file.");
		for(int i=0; i<counter; i++)
		{
			System.out.println(strings[i]);
		}
	}
}