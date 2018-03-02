
package com.rahulmadbhavi.training;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo
{
	public static void main(String[] args)
	{
		CountDownLatch countDownLatch1 = new CountDownLatch(5);
		CountDownLatch countDownLatch2 = new CountDownLatch(5);
		CountDownLatch countDownLatch3 = new CountDownLatch(5);
		CountDownLatch countDownLatch4 = new CountDownLatch(5);

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		System.out.println("Starting");

		executorService.execute(new MyThread(countDownLatch1, "A"));
		executorService.execute(new MyThread(countDownLatch2, "B"));
		executorService.execute(new MyThread(countDownLatch3, "C"));
		executorService.execute(new MyThread(countDownLatch4, "D"));

		try
		{
			countDownLatch1.await();
			countDownLatch2.await();
			countDownLatch3.await();
			countDownLatch4.await();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		executorService.shutdown();
		System.out.println("Done");
	}
}
