
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String arg[])
	{
		Pattern pattern = Pattern.compile("W+");
		Matcher matcher = pattern.matcher("W WW WWW");

		while(matcher.find())
		{
			System.out.println("Match : " + matcher.group());
		}
	}
}