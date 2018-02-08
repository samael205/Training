
package com.rahulmadbhavi.training;

class StaticDemo
{
	static int a;
	static int b;

	static
	{
		a = 42;
		b = 99;
	}

	static void callMe()
	{
		System.out.println("a : " + a);
	}
}