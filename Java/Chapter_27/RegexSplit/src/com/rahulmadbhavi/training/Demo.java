
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("[ ,.!]");

		String strings[] = pattern.split("one two,alpha9 12!done.");

		for(int i=0; i<strings.length; i++)
		{
			System.out.println("Next token : " + strings[i]);
		}
	}
}