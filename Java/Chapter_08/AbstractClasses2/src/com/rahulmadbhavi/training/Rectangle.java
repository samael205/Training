
package com.rahulmadbhavi.training;

class Rectangle extends Figure
{
	Rectangle(double dim1, double dim2)
	{
		super(dim1, dim2);
	}

	double area()
	{
		System.out.println("Inside area for rectangle.");
		return dim1*dim2;
	}
}