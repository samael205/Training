
package com.rahulmadbhavi.training;

class Overload
{
	void test()
	{
		System.out.println("No parameters");
	}

	void test(int a, int b)
	{
		System.out.println("a, b : " + a + ", " + b);
	}

	void test(int d)
	{
		System.out.println("int a : " + d);
	}

	void test(double d)
	{
		System.out.println("double a : " + d);
	}	
}