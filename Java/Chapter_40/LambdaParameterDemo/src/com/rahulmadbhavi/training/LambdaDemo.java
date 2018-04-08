package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String args[])
	{
		NumericTest isEven = (n) -> (n % 2) == 0;
		System.out.println("8 is even : " + isEven.test(8));
		System.out.println("9 is even : " + isEven.test(9));
		
		NumericTest isPositive = (n) -> n > 0;
		System.out.println("+8 is positive : " + isPositive.test(8));
		System.out.println(" 0 is positive : " + isPositive.test(0));
		System.out.println("-8 is positive : " + isPositive.test(-8));
	}
}
