
package com.rahulmadbhavi.training;

class Triangle extends Figure
{
	Triangle(double dim1, double dim2)
	{
		super(dim1, dim2);
	}

	double area()
	{
		System.out.println("Inside area for triangle.");
		return (dim1 * dim2 / 2.0);
	}
}