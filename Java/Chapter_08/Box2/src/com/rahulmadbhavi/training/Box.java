
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	Box(Box ob)
	{
		this.width = ob.width;
		this.depth = ob.depth;
		this.height = ob.height;
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
		this.width = length;
		this.depth = length;
		this.height = length;
	}

	double volume()
	{
		return (width * depth * height);
	}
}