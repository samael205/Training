
package com.rahulmadbhavi.training;

class Bean
{
	int a;
	int b;

	Bean(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	Bean(int side)
	{
		this(side, side);
	}

	Bean()
	{
		this(0);
	}

	void printDim()
	{
		System.out.println("Dimensions : " + a + " x " + b);
	}
}