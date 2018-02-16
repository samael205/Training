
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		try
		{
			ProcessBuilder pb = new ProcessBuilder("notepad.exe", "Test.txt");
			pb.start();
		}
		catch(Exception e)
		{
			System.out.println("Error opening notepad.");
		}
	}
}