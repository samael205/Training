
package com.rahulmadbhavi.training;

class AccessTest
{
	public static void main(String args[])
	{
		Test ob = new Test();

		// Thes are ok, a and b may be accessed directly
		ob.a = 10;
		ob.b = 20;

		// This is not ok and will cause error if uncommented
		// ob.c = 100;

		// You must access it through its methods
		ob.setc(100);
		System.out.println("ob.a, ob.b, ob.c : " + ob.a + ", " + ob.b + ", " + ob.getc());
	}
}