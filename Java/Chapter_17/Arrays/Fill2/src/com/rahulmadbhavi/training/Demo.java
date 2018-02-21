
package com.rahulmadbhavi.training;

import java.util.Arrays;

class Demo
{
	public static void main(String args[])
	{
		int numbers[] = {0, 0, 0, 0, 0};

		Arrays.fill(numbers, 1, 4, 4);

		System.out.println("Contents of array : ");
		for(int x : numbers)
		{
			System.out.println(x);
		}
	}
}