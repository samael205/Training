
package com.rahulmadbhavi.training;

import java.util.Arrays;

class Demo
{
	public static void main(String args[])
	{
		int numbers[] = {3, 4, 5, 1, 2};

		Arrays.sort(numbers, 1, 4);

		System.out.println("Content of array : ");
		for(int x : numbers)
		{
			System.out.println(x);
		}
	}
}