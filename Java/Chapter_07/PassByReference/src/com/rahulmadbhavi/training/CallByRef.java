
package com.rahulmadbhavi.training;

class CallByRef
{
	public static void main(String args[])
	{
		Test ob = new Test(10, 20);

		System.out.println("ob.a and ob.b before meth call : " + ob.a + ", " + ob.b);

		ob.meth(ob);

		System.out.println("ob.a and ob.b after meth call : " + ob.a + ", " + ob.b);
	}
}