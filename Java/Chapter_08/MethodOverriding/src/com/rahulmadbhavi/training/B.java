
package com.rahulmadbhavi.training;

class B extends A
{
	int k;

	B(int i, int j, int k)
	{
		super(i, j);
		this.k = k;
	}

	void show()
	{
		System.out.println("k : " + k);
	}
}