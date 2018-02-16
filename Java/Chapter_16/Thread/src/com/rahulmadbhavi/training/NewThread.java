
package com.rahulmadbhavi.training;

class NewThread extends Thread
{
	boolean suspendFlag;

	NewThread(String threadName, ThreadGroup tgOb)
	{
		super(tgOb, threadName);
		System.out.println("New Thread : " + this);
		suspendFlag = false;
		start();
	}

	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(getName() + " : " + i);	
				Thread.sleep(1000);
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in " + getName());
		}

		System.out.println(getName() + " is exitting.");
	}

	void mySuspend()
	{
		suspendFlag = true;
	}	

	synchronized void myResume()
	{
		suspendFlag = false;
		notify();
	}
}