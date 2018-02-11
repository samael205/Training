
package com.rahulmadbhavi.training;

class SuspendResume
{
	public static void main(String args[])
	{
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");

		try
		{
			Thread.sleep(1000);

			ob1.thread.suspend();
			System.out.println("Suspending thread One.");			
			Thread.sleep(1000);

			ob1.thread.resume();
			System.out.println("Resuming thread One.");
			ob2.thread.suspend();
			System.out.println("Suspending thread Two.");
			Thread.sleep(1000);

			ob2.thread.resume();
			System.out.println("Resuming thread Two.");
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}

		try
		{
			ob1.thread.join();
			ob2.thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}

		System.out.println("Main thread exitting.");
	}
}