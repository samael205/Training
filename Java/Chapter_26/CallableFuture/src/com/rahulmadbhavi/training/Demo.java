
package com.rahulmadbhavi.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo
{
	public static void main(String args[])
	{
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Future<Integer> future1;
		Future<Double> future2;
		Future<Integer> future3;

		System.out.println("Starting");

		future1 = executorService.submit(new Sum(10));
		future2 = executorService.submit(new Hypotenuse(3, 4));
		future3 = executorService.submit(new Factorial(5));

		try
		{
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		catch(ExecutionException e)
		{
			System.out.println(e);
		}

		executorService.shutdown();
		System.out.println("Done");
	}
}
