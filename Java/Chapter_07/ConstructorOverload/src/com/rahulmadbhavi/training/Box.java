
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double height;
	double depth;

	Box()
	{
		this.width = -1;
		this.depth = -1;
		this.height = -1;
	}

	Box(double width, double depth, double height)
	{
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	Box(double length)
	{
		this.width = this.depth = this.height = length;
	}

	double volume()
	{
		return this.width * this.depth * this.height;
	}
}