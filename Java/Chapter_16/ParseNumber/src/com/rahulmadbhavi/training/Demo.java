
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string;
		int i;
		int sum = 0;

		System.out.println("Enter numbers, 0 to quit :");

		do
		{
			string = br.readLine();

			try
			{
				i = Integer.parseInt(string);
			}
			catch(NumberFormatException e)
			{
				i = 0;
			}

			sum += i;

			System.out.println("Current sum : " + sum);

		}while(i != 0);
	}
}