
package com.rahulmadbhavi.training;

class Clicker implements Runnable
{
	long click;
	Thread thread;
	private volatile boolean running;

	public Clicker(int priority)
	{
		click = 0;
		running = true;
		thread = new Thread(this);
		thread.setPriority(priority);
	}

	public void run()
	{
		while(running)
		{
			click++;
		}
	}

	public void stop()
	{
		running = false;
	}

	public void start()
	{
		thread.start();
	}
}