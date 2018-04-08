package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String args[])
	{
		NumericTest isFactor = (n, d) ->
		{
			return (n % d) == 0;
		};
		
		System.out.println("Is 2 a factor of 10 : " + isFactor.test(10, 2));
		System.out.println("Is 4 a factor of 10 : " + isFactor.test(10, 4));
	}
}
