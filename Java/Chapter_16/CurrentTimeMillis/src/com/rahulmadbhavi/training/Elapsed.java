
package com.rahulmadbhavi.training;

class Elapsed
{
	public static void main(String args[])
	{
		long start, end;

		System.out.println("Timing a loop from 0 to 1,000,000");
		start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++);
		end = System.currentTimeMillis();

		System.out.println("Elapsed time : " + (end - start));
	}
}