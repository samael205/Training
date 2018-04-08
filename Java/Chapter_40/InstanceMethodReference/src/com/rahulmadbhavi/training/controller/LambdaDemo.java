package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.utility.MyFunction;
import com.rahulmadbhavi.training.utility.StringOperations;

public class LambdaDemo
{
	private static String strOperation(MyFunction myFunction, String input)	
	{
		return myFunction.function(input);
	}
	
	public static void main(String[] args)
	{
		String inputString = "This is a test string";
		String outputString;
		
		StringOperations stringOperations = new StringOperations();
		
		outputString = strOperation(stringOperations::reverse, inputString);
		
		System.out.println("Original String : " + inputString);
		System.out.println("Reversed String : " + outputString);
	}
}
