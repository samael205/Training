
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int copy[] = Arrays.copyOf(numbers, 10);

		System.out.println("Original array :");
		for(int x : numbers)
		{
			System.out.println(x);
		}

		System.out.println();

		System.out.println("Copied array :");
		for(int x : copy)
		{
			System.out.println(x);
		}
	}
}