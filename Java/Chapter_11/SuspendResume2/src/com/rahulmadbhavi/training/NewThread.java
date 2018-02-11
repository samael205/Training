
package com.rahulmadbhavi.training;

class NewThread implements Runnable
{
	String name;
	Thread thread;
	boolean suspendFlag;

	NewThread(String name)
	{
		this.name = name;
		thread = new Thread(this, name);
		System.out.println("New thread : " + thread);
		suspendFlag = false;
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
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted.");
		}

		System.out.println(name + " exitting.");
	}

	void mysuspend()
	{
		suspendFlag = true;
	}

	synchronized void myresume()
	{
		suspendFlag = false;
		notify();
	}
}