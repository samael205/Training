package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		GenericFunction<String> stringReverse = (String input) ->
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

		GenericFunction<Integer> integerReverse = (Integer value) ->
		{
			int returnValue = 0;
			
			while(value > 0)
			{
				returnValue *= 10;
				returnValue += (value % 10);
				value /= 10;
			}
			
			return returnValue;
		};
		
		System.out.println("Reverse of \"abcde\" is " + stringReverse.function("abcde"));
		System.out.println("Reverse of 1234567 is " + integerReverse.function(1234567));
	}
}
