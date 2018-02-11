
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		Clicker high = new Clicker(Thread.NORM_PRIORITY + 4);
		Clicker low = new Clicker(Thread.NORM_PRIORITY - 4);

		low.start();
		high.start();

		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}

		low.stop();
		high.stop();

		try
		{
			high.thread.join();
			low.thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught.");
		}

		System.out.println("Low priority thread count : " + low.click);
		System.out.println("High priority thread count : " + high.click);
	}
}