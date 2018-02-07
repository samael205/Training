
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	// Compute and return volume
	double volume()
	{
		return width*depth*height;
	}

	// Sets dimensions of the box
	void setDim(double width,double  depth,double height)
	{
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
}