
package com.rahulmadbhavi.training;

class Consumer implements Runnable
{
	Base base;

	Consumer(Base base)
	{
		this.base = base;
		new Thread(this, "Consumer").start();
	}

	public void run()
	{
		while(true)
		{
			base.get();
		}
	}
}