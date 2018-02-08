
package com.rahulmadbhavi.training;

class Test
{
	int a, b;

	Test(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void meth(Test ob)
	{
		ob.a *= 2;
		ob.b /= 2;
	}
}