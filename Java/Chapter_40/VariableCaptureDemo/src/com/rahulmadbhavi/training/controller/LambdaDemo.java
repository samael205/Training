package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.utility.MyFunction;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		int myNumber = 4;
		
		MyFunction myLambda = (n) ->
		{
			// Local variables can be used inside lambda definition.
			int returnValue = n + (1 << myNumber);
			
			// Following is illegal. Local variables are final.
			// myNumber++;
			
			return returnValue;
		};
		
		System.out.println("3 + (1 << 4) = " + myLambda.function(3));
	}
}
