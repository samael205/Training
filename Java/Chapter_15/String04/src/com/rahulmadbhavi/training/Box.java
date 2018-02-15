
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	Box(double width, double depth, double height)
	{
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	public String toString()
	{
		return ("Box(" + width + ", " + depth + ", " + height + ")");
	}
}