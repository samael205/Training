
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[])
	{
		String string;
		Console console;

		console = System.console();

		if(console == null)
		{
			return;
		}

		string = console.readLine("Enter a string : ");
		console.printf("Here is your string : %s\n", string);
	}
}