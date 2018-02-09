
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		B b = new B();

		A a = b;

		b.callMe();
		System.out.println();

		b.callMeToo();
		System.out.println();

		a.callMe();
		System.out.println();

		a.callMeToo();
		System.out.println();
	}
}