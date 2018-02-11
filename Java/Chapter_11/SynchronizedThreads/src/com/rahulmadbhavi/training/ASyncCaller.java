
package com.rahulmadbhavi.training;

class ASyncCaller implements Runnable
{
	String msg;
	ASyncCallMe target;
	Thread thread;

	public ASyncCaller(ASyncCallMe target, String msg)
	{
		this.target = target;
		this.msg = msg;
		thread = new Thread(this);
		thread.start();
	}

	public void run()
	{
		target.call(msg);
	}
}