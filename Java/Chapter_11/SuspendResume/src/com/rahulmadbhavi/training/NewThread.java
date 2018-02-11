
package com.rahulmadbhavi.training;

class NewThread implements Runnable
{
	String name;
	Thread thread;

	NewThread(String name)
	{
		this.name = name;
		thread = new Thread(this, name);
		System.out.println("New thread : " + thread);
		thread.start();
	}

	public void run()
	{
		try
		{
			for(int i=15; i>0; i--)
			{
				System.out.println(name + " : " + i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted.");
		}

		System.out.println(name + " exitting.");
	}
}