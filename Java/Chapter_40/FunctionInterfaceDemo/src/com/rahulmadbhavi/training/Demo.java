package com.rahulmadbhavi.training;

import java.util.function.Function;

public class Demo
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> factorial = (n) ->
		{
			int result = 1;
			
			for(int counter = 2; counter <= n; result *= counter++);
			
			return result;
		};

		for(int counter = 0; counter < 10; counter++)
		{
			System.out.println("Factorial of " + counter + " = " + factorial.apply(counter));
		}
	}
}
