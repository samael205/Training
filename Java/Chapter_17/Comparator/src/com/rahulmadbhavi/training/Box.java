
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

	Box(double length)
	{
		this(length, length, length);
	}

	Box()
	{
		this(0.0);
	}

	double volume()
	{
		return width * depth * height;
	}

	public String toString()
	{
		return ("Box(" + width + ", " + depth + ", " + height + ")");
	}
}