
package com.rahulmadbhavi.training;

import java.util.regex.*;

public class Demo
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("Java");
		Matcher matcher = pattern.matcher("Java 8");

		System.out.println("Looking for Java against Java 8.");

		if(matcher.find())
		{
			System.out.println("Subsequence found.");
		}
		else
		{
			System.out.println("Subsequence not found.");
		}
	}
}