package com.rahulmadbhavi.training;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable
{
	CountDownLatch countDownLatch;
	
	public MyRunnable(CountDownLatch countDownLatch)
	{
		this.countDownLatch = countDownLatch;
		new Thread(this).start();
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
			countDownLatch.countDown();
		}
	}
}
