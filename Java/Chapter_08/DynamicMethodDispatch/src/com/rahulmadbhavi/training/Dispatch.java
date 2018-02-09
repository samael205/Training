
package com.rahulmadbhavi.training;

class Dispatch
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A temp;

		temp = a;
		temp.callMe();

		temp = b;
		temp.callMe();

		temp = c;
		temp.callMe();
	}
}