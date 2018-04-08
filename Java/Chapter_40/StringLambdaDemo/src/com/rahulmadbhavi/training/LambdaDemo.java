package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		StringFunction reverse = (String input) ->
		{
			String returnValue = null;
			
			if(input != null)
			{
				returnValue = "";
				int length = input.length();
				for(int index = 0; index < length; index++)
				{
					returnValue += input.charAt(length - index - 1);
				}
			}
			
			return returnValue;
		};
		
		System.out.println("Reverse of \"\" is : \"" + reverse.convert("") + "\"");
		System.out.println("Reverse of \"a\" is : \"" + reverse.convert("a") + "\"");
		System.out.println("Reverse of \"ab\" is : \"" + reverse.convert("ab") + "\"");
		System.out.println("Reverse of \"abc\" is : \"" + reverse.convert("abc") + "\"");
		System.out.println("Reverse of \"abcd\" is : \"" + reverse.convert("abcd") + "\"");
		System.out.println("Reverse of \"abcde\" is : \"" + reverse.convert("abcde") + "\"");
	}
}
