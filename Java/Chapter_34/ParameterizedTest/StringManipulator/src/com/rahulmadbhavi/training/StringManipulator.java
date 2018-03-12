package com.rahulmadbhavi.training;

public class StringManipulator
{
	private String string;
	
	public StringManipulator()
	{
		string = "";
	}
	
	public StringManipulator(String string)
	{
		this.string = string;
	}
	
	public String toUpperCase()
	{
		String returnValue = null;
		
		if(string == null)
		{
			return null;
		}
		else
		{
			char data[] = string.toCharArray();
			
			for(int i=0; i<data.length; i++)
			{
				if(data[i] >= 97 && data[i] <= 122)
				{
					data[i] -= 32;
				}
			}
			
			returnValue = new String(data);
		}
		
		return returnValue;
	}
}
