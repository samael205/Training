package com.rahulmadbhavi.training;

import java.util.concurrent.Semaphore;

public class SemDemo
{
	public static void main(String args[])
	{
		Semaphore semaphore = new Semaphore(1);
		
		new IncThread(semaphore, "A");
		new DecThread(semaphore, "B");		
	}
}
