package com.rahulmadbhavi.training.utility;

public class StringOperations
{
	public String reverse(String input)
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
}
