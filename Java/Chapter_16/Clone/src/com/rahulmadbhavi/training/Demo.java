
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		TestClone x1 = new TestClone();
		TestClone x2;

		x1.a = 10;
		x1.b = 20.98;

		x2 = x1.cloneTest();

		System.out.println("x1.a : " + x1.a);
		System.out.println("x1.b : " + x1.b);
		System.out.println();

		System.out.println("x2.a : " + x2.a);
		System.out.println("x2.b : " + x2.b);
		System.out.println();
	}
}