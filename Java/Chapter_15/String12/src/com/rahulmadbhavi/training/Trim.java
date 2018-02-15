
package com.rahulmadbhavi.training;

import java.io.*;

class Trim
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		System.out.println("Enter 'stop' to quit.");
		System.out.println("\nSelect state :");
		System.out.println("> Karnataka");
		System.out.println("> Kerala");
		System.out.println("> Andhra Pradesh");
		
		do
		{
			System.out.print("\nEnter state : ");
			line = br.readLine();
			line = line.trim();

			if(line.equalsIgnoreCase("Karnataka"))
			{
				System.out.println("You selected Karnataka.");
			}
			else if(line.equalsIgnoreCase("Kerala"))
			{
				System.out.println("You selected Kerala.");
			}
			else if(line.equalsIgnoreCase("Andhra Pradesh"))
			{
				System.out.println("You selected Andhra Pradesh.");
			}

		}while(!line.equalsIgnoreCase("stop"));
	}
}