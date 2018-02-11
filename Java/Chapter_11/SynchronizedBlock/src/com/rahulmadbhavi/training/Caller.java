
package com.rahulmadbhavi.training;

class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread thread;

	public Caller(Callme target, String msg)
	{
		this.target = target;
		this.msg = msg;
		thread = new Thread(this);
		thread.start();
	}

	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}