
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


	public String toString()
	{
		return ("Box(" + width + ", " + depth + ", " + height + ")");
	}

	void setWidth(double width)
	{
		this.width = width;
	}

	void setDepth(double depth)
	{
		this.depth = depth;
	}

	void setHeight(double height)
	{
		this.height = height;
	}

	double getWidth()
	{
		return width;
	}

	double getDepth()
	{
		return depth;		
	}

	double getHeight()
	{
		return height;
	}

	double volume()
	{
		return width*depth*height;
	}
}