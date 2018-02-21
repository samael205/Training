
package com.rahulmadbhavi.training;

import java.util.Arrays;

class Demo
{
	public static void main(String args[])
	{
		int numbers1[] = {1, 2, 3, 4, 5};
		int numbers2[] = {1, 2, 3, 4, 5};
		int numbers3[] = {1, 2, 4, 3};

		System.out.println("Arrays.equals(numbers1, numbers2) : " + Arrays.equals(numbers1, numbers2));
		System.out.println("Arrays.equals(numbers1, numbers3) : " + Arrays.equals(numbers1, numbers3));
	}
}