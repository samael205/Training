
package com.rahulmadbhavi.training;

import java.util.concurrent.Semaphore;

// A thread of execution that increments count
public class DecThread implements Runnable
{
	String name;
	Semaphore semaphore;
	
	public DecThread(Semaphore semaphore, String name)
	{
		this.semaphore = semaphore;
		this.name = name;
		new Thread(this).start();
	}
	
	@Override
	public void run()
	{
		System.out.println("Starting : " + name);
		
		try
		{
			// First, get a permit
			System.out.println(name + " is waiting for a permit.");
			
			semaphore.acquire();
			
			System.out.println(name + " gets a permit.");
			
			// Now access shared resource.
			for(int i=0; i<5; i++)
			{
				Shared.count--;
				System.out.println(name + " : " + Shared.count);
				
				// Now allow a context switch if possible
				Thread.sleep(10);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		// Release the permit.
		System.out.println(name + " releases the permit.");
		semaphore.release();
	}
}
