
package com.rahulmadbhavi.training;

import java.util.Arrays;

class Demo
{
	public static void main(String args[])
	{
		int numbers[] = new int[5];

		Arrays.fill(numbers, 4);

		System.out.println("Contents of array : ");
		for(int x : numbers)
		{
			System.out.println(x);
		}
	}
}