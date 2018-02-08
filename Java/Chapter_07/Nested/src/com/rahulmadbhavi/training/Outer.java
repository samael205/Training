
package com.rahulmadbhavi.training;

class Outer
{
	int outer_x;

	Outer()
	{
		outer_x = 100;
	}

	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}

	class Inner
	{
		void display()
		{
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}