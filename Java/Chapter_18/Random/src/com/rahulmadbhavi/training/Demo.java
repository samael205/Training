
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Random random = new Random();

		System.out.println();

		System.out.println("Generating ten booleans : ");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextBoolean());
		}
		System.out.println();

		System.out.println("Generating ten integers : ");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextInt());
		}
		System.out.println();

		System.out.println("Generating ten integers within range 0 to 10");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextInt(10));
		}
		System.out.println();

		System.out.println("Generating ten doubles : ");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextDouble());
		}
		System.out.println();

		System.out.println("Generating ten floats : ");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextFloat());
		}
		System.out.println();

		System.out.println("Generating ten Gaussian random numbers : ");
		for(int i=0; i<10; i++)
		{
			System.out.println(random.nextGaussian());
		}
		System.out.println();
	}
}