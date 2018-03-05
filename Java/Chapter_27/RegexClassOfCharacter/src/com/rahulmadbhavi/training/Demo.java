
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("[a-z]+");
		Matcher matcher = pattern.matcher("this is a regex test");

		while(matcher.find())
		{
			System.out.println("Match : " + matcher.group());
		}
	}
}