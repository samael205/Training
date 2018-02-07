
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	Box()
	{
		this.width = 0;
		this.depth = 0;
		this.height = 0;
	}

	Box(double width, double depth, double height)
	{
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	double volume()
	{
		return (width*depth*height);
	}
}