
package com.rahulmadbhavi.training;

class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("Number of arguments : " + args.length);
		System.out.println("The command line arguments are ");

		for(String x : args)
		{
			System.out.println(x);
		}
	}
}