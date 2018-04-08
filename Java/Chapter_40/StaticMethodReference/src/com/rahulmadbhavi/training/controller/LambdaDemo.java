
package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.utility.MyFunction;

public class LambdaDemo
{
	private static String stringReverse(String input)
	{
		StringBuilder returnValue = null;
		
		if(input != null)
		{
			int length = input.length();
			returnValue = new StringBuilder(length);
			
			for(int index = 0; index < length; index++)
			{
				returnValue.append(input.charAt(length - index - 1));
			}
		}
		
		return returnValue.toString();
	}

	private static String stringOperation(MyFunction myFunction, String input)
	{
		return myFunction.function(input);
	}
	
	public static void main(String[] args)
	{
		String inputString = "This is a test string";
		String outputString;
		
		outputString = stringOperation(LambdaDemo::stringReverse, inputString);
		
		System.out.println("Original String : " + inputString);
		System.out.println("Reversed String : " + outputString);
	}
}
