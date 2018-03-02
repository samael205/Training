
package com.rahulmadbhavi.training;

import java.util.concurrent.locks.ReentrantLock;

public class Demo
{
	public static void main(String[] args)
	{
		ReentrantLock lock = new ReentrantLock();

		new LockThread(lock, "A");
		new LockThread(lock, "B");
	}
}
