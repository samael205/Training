
package com.rahulmadbhavi.training;

class Notepad
{
	public static void main(String args[])
	{
		Runtime runtime = Runtime.getRuntime();
		Process process = null;

		try
		{
			process = runtime.exec("notepad");
			process.waitFor();
		}
		catch(Exception e)
		{
			System.out.println("Error opening notepad.");
		}

		System.out.println("Notepad returned : " + process.exitValue());
	}
}