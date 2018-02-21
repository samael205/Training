
package com.rahulmadbhavi.training;

import java.util.Arrays;

class Demo
{
	public static void main(String args[])
	{
		int numbers[] = {2, 1, 5, 4, 3};

		Arrays.sort(numbers);

		System.out.println("Contents of array : ");
		for(int x : numbers)
		{
			System.out.println(x);
		}
	}
}