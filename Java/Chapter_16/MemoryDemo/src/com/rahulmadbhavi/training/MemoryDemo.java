
package com.rahulmadbhavi.training;

class MemoryDemo
{
	public static void main(String args[])
	{
		Runtime runtime = Runtime.getRuntime();

		long mem1, mem2;
		int i;

		Integer someints[] = new Integer[1000];

		System.out.println("Total memory is : " + runtime.totalMemory());

		mem1 = runtime.freeMemory();
		System.out.println("Initial free memory : " + mem1);

		runtime.gc();
		mem1 = runtime.freeMemory();
		System.out.println("Free memory after garbage collection : " + mem1);

		for(i=0; i<1000; i++)
		{
			someints[i] = new Integer(i);
		}

		mem2 = runtime.freeMemory();
		System.out.println("Free memory after allocation : " + mem2);
		System.out.println("Memory used by allocation : " + (mem1 - mem2));


		for(i=0; i<1000; i++)
		{
			someints[i] = null;
		}

		runtime.gc();

		mem2 = runtime.freeMemory();
		System.out.println("Free memory after garbage collection : " + mem2);
	}
}