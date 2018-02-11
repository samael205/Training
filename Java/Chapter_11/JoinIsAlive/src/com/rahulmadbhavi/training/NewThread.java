
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
			for(int i=5; i>0; i--)
			{
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted : " + name);
		}

		System.out.println("Exitting child thread : " + name);
	}
}