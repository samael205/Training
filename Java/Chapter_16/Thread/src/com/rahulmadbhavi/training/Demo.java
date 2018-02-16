
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		ThreadGroup groupA = new ThreadGroup("Group A");
		ThreadGroup groupB = new ThreadGroup("Group B");

		NewThread ob1 = new NewThread("One", groupA);
		NewThread ob2 = new NewThread("Two", groupA);
		NewThread ob3 = new NewThread("Three", groupB);
		NewThread ob4 = new NewThread("Four", groupB);

		System.out.println("\nHere is output from list() : ");
		groupA.list();
		groupB.list();
		System.out.println();

		System.out.println("Suspending Group A");
		Thread tga[] = new Thread[groupA.activeCount()];
		groupA.enumerate(tga);
		for(int i=0; i<tga.length; i++)
		{
			((NewThread) tga[i]).mySuspend();
		}

		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}

		System.out.println("Resuming Group A");
		for(int i=0; i<tga.length; i++)
		{
			((NewThread) tga[i]).myResume();
		}

		try
		{
			System.out.println("Waiting for threads to finish.");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception in Main thread.");
		}

		System.out.println("Main thread exitting.");
	}	
}