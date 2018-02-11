
package com.rahulmadbhavi.training;

class Producer implements Runnable
{
	Base base;

	Producer(Base base)
	{
		this.base = base;
		new Thread(this, "Producer").start();
	}

	public void run()
	{
		int i = 0;

		while(true)
		{
			base.put(i++);
		}
	}
}
