
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern;
		Matcher matcher;
		boolean isFound;

		pattern = Pattern.compile("Java");
		matcher = pattern.matcher("Java");

		isFound = matcher.matches();

		System.out.println("Testing Java against Java.");
		if(isFound)
		{
			System.out.println("Result : Matches.");
		}
		else
		{
			System.out.println("Result : Does not Match.");
		}

		System.out.println();

		matcher = pattern.matcher("Java 8");

		isFound = matcher.matches();

		System.out.println("Testing Java against Java 8.");
		if(isFound)
		{
			System.out.println("Result : Matches.");
		}
		else
		{
			System.out.println("Result : Does not Match.");
		}
	}
}