
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("e.+d");
		Matcher matcher = pattern.matcher("extend cup and table");

		while(matcher.find())
		{
			System.out.println("Match : " + matcher.group());
		}
	}
}