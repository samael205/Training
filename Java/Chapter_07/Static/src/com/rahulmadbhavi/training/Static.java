
// Demonstrate static variables, methods and blocks

package com.rahulmadbhavi.training;

class Static
{
	static int a;
	static int b;

	static void meth(int x)
	{
		System.out.println("x : " + x);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

	static
	{
		System.out.println("Static block initialized.");
		a = 3;
		b = a * 4;
	}

	public static void main(String args[])
	{
		meth(42);
	}
}