
package com.rahulmadbhavi.training;

class OverloadDemo2
{
	public static void main(String args[])
	{
		Overload ob = new Overload();

		int i = 88;

		ob.test();
		ob.test(10, 20);
		ob.test(i);
		ob.test(80.0f);
		ob.test(123.25);
	}
}