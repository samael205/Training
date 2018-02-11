
package com.rahulmadbhavi.training;

class DemoJoin
{
	public static void main(String args[])
	{
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");

		System.out.println("Thread one is alive : " + ob1.thread.isAlive());
		System.out.println("Thread two is alive : " + ob2.thread.isAlive());
		System.out.println("Thread three is alive : " + ob3.thread.isAlive());

		try
		{
			System.out.println("Waiting for threads to finish");
			ob1.thread.join();
			ob2.thread.join();
			ob3.thread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}

		System.out.println("Thread one is alive : " + ob1.thread.isAlive());
		System.out.println("Thread two is alive : " + ob2.thread.isAlive());
		System.out.println("Thread three is alive : " + ob3.thread.isAlive());

		System.out.println("Main thread exitting.");
	}
}