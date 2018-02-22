
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		double sum = 0.0;

		System.out.println("Enter numbers to average");

		while(scanner.hasNext())
		{
			if(scanner.hasNextDouble())
			{
				sum += scanner.nextDouble();
				count++;
			}
			else
			{
				String str = scanner.next();
				if(str.equals("done"))
				{
					break;
				}
				else
				{
					System.out.println("Data format error.");
					return;
				}
			}
		}

		System.out.println("Average : " + sum / count);
	}
}