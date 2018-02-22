
package com.rahulmadbhavi.training;

import java.io.*;
import java.util.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		FileReader fin = new FileReader("File.txt");
		Scanner scanner = new Scanner(fin);

		while(scanner.hasNext())
		{
			if(scanner.hasNextInt())
			{
				System.out.printf("%-10s : %d\n", "int", scanner.nextInt());
			}
			else if(scanner.hasNextDouble())
			{
				System.out.printf("%-10s : %g\n", "double", scanner.nextDouble());
			}
			else if(scanner.hasNextBoolean())
			{
				System.out.printf("%-10s : %b\n", "boolean", scanner.nextBoolean());
			}
			else
			{
				System.out.printf("%-10s : %s\n", "String", scanner.next());
			}			
		}

		fin.close();
	}
}