
package com.rahulmadbhavi.training;

class B extends A
{
	int i;	// This i hides the i in A

	B(int ai, int bi)
	{
		super.i = ai;
		this.i = bi;
	}

	void show()
	{
		System.out.println("i in superclass : " + super.i);
		System.out.println("i in subclass : " + this.i);
	}
}