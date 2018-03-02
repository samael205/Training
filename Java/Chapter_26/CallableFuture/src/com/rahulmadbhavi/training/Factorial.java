
package com.rahulmadbhavi.training;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>
{
	int stop;

	public Factorial(int v)
	{
		stop = v;
	}

	@Override
	public Integer call()
	{
		int fact = 1;

		for(int i = 2; i <= stop; i++)
		{
			fact *= i;
		}

		return fact;
	}
}
