package com.rahulmadbhavi.training;

import java.util.concurrent.CyclicBarrier;

public class BarDemo
{
	public static void main(String[] args)
	{
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
		
		new MyThread(cyclicBarrier, "A");
		new MyThread(cyclicBarrier, "B");
		new MyThread(cyclicBarrier, "C");
		
		new MyThread(cyclicBarrier, "D");
		new MyThread(cyclicBarrier, "E");
		new MyThread(cyclicBarrier, "F");		
	}
}
