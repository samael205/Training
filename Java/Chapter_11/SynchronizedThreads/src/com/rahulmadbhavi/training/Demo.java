
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		ASyncCallMe utarget = new ASyncCallMe();
		ASyncCaller aob1 = new ASyncCaller(utarget, "Hello");
		ASyncCaller aob2 = new ASyncCaller(utarget, "Unsynchronized");
		ASyncCaller aob3 = new ASyncCaller(utarget, "World");

		System.out.println("Unsynchronized threads.");

		try
		{
			aob1.thread.join();
			aob2.thread.join();
			aob3.thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

		System.out.println();

		SyncCallMe starget = new SyncCallMe();
		SyncCaller sob1 = new SyncCaller(starget, "Hello");
		SyncCaller sob2 = new SyncCaller(starget, "Synchronized");
		SyncCaller sob3 = new SyncCaller(starget, "World");

		System.out.println("Synchronized threads.");

		try
		{
			sob1.thread.join();
			sob2.thread.join();
			sob3.thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

		System.out.println();
	}
}