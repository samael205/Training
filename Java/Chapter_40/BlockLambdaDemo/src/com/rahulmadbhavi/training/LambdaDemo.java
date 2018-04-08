package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		NumericTest factorial = (n) ->
		{
			int result = 1;
			
			for(int i=2; i<=n; i++)
			{
				result*=i;
			}
			
			return result;
		};
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Factorial of " + i + " is " + factorial.value(i));
		}
	}
}
