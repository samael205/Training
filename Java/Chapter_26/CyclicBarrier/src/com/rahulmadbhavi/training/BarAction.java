package com.rahulmadbhavi.training;

// An object of this class is called when the
// CyclicBarrier ends.
public class BarAction implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Barrier Reached!");
	}
}
