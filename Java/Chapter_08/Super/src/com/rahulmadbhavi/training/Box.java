
package com.rahulmadbhavi.training;

class Box
{
	private double width;
	private double depth;
	private double height;

	Box(Box box)
	{
		this.width = box.width;
		this.depth = box.depth;
		this.height = box.height;
	}

	Box(double width, double depth, double height)
	{
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	Box()
	{
		this.width = -1;
		this.depth = -1;
		this.height = -1;
	}

	Box(double length)
	{
		this.width = this.depth = this.height = length;
	}

	double volume()
	{
		return (width * depth * height);
	}
}