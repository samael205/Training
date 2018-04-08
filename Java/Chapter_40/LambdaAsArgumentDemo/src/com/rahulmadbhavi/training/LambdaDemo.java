package com.rahulmadbhavi.training;

public class LambdaDemo
{
	private static String stringOperation(StringFunction sf, String input)
	{
		return sf.function(input);
	}
	
	public static void main(String[] args)
	{
		String inputString = "Lambdas add power to Java";
		String outputString;
		
		System.out.println("The input string is : " + inputString);
		
		outputString = stringOperation((str) -> str.toLowerCase(), inputString);
		System.out.println("Input string in lower case : " + outputString);
		
		outputString = stringOperation((str) -> str.toUpperCase(), inputString);
		System.out.println("Input string in upper case : " + outputString);
		
		outputString = stringOperation((str) -> new StringBuilder(str).reverse().toString(), inputString);
		System.out.println("Reversed input string : " + outputString);
	}
}
