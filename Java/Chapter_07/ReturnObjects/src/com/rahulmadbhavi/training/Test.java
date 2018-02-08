
package com.rahulmadbhavi.training;

class Test
{
	int a;

	Test(int a)
	{
		this.a = a;
	}

	Test incrementByTen()
	{
		Test temp = new Test(a + 10);
		return temp;
	}
}