
package com.rahulmadbhavi.training;

import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		int count = 0;
		double sum = 0.0;

		FileReader fin = new FileReader("File.txt");
		Scanner scanner = new Scanner(fin);

		System.out.println();

		while(scanner.hasNext())
		{
			if(scanner.hasNextDouble())
			{
				sum += scanner.nextDouble();
				count++;
			}
			else
			{
				System.out.println("File format error.");
				fin.close();
				return;
			}
		}

		fin.close();
		System.out.println("Average : " + sum/count);
		System.out.println();
	}
}