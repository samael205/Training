
package com.rahulmadbhavi.training;

class NewThread implements Runnable
{
	Thread thread;

	NewThread()
	{
		thread = new Thread(this, "Demo Thread");

		System.out.println("Child thread : " + thread);

		thread.start();
	}

	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println("Child Thread : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child interrupted.");
		}

		System.out.println("Exitting child thread.");
	}
}