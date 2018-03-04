
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("test");
		Matcher matcher = pattern.matcher("test 1 2 3 test");

		while(matcher.find())
		{
			System.out.println("test found at index : " + matcher.start());
		}
	}
}