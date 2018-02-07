
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	Box()
	{
		this.width = 10;
		this.depth = 10;
		this.height = 10;
	}

	double volume()
	{
		return width*depth*height;
	}
}