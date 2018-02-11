
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Base base = new Base();

		new Producer(base);
		new Consumer(base);

		System.out.println("Press Ctrl-C to stop.");
	}
}