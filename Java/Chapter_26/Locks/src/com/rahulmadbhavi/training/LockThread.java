
package com.rahulmadbhavi.training;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable
{
	String			name;
	ReentrantLock	lock;

	public LockThread(ReentrantLock lock, String name)
	{
		this.lock = lock;
		this.name = name;

		new Thread(this).start();
	}

	@Override
	public void run()
	{
		System.out.println("Starting : " + name);

		try
		{
			// First, lock count
			System.out.println(name + " is waiting to lock count.");
			lock.lock();
			System.out.println(name + " is locking count.");

			Shared.count++;
			System.out.println(name + " : " + Shared.count);

			// Now allow a context switch if possible
			System.out.println(name + " is sleeping.");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(name + " is unlocking count.");
			lock.unlock();
		}
	}
}
