
package com.rahulmadbhavi.training;

class Figure
{
	double dim1;
	double dim2;

	Figure(double dim1, double dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	double area()
	{
		System.out.println("Area for the figure is undefined.");
		return 0;
	}
}