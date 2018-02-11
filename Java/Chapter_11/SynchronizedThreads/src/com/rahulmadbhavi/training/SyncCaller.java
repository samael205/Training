
package com.rahulmadbhavi.training;

class SyncCaller implements Runnable
{
	String msg;
	SyncCallMe target;
	Thread thread;

	public SyncCaller(SyncCallMe target, String msg)
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