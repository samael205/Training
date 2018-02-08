
package com.rahulmadbhavi.training;

class CallByValue
{
	public static void main(String args[])
	{
		Test ob = new Test();

		int a = 15, b = 20;

		System.out.println("a and b before method call : " + a + ", " + b);

		ob.meth(a, b);

		System.out.println("a and b after method call : " + a + ", " + b);
	}
}