
package com.rahulmadbhavi.training;

class Box
{
	double width;
	double depth;
	double height;

	Box()
	{
		System.out.println("Inside constructor of Box object.");

		this.width = 10;
		this.height = 10;
		this.depth = 10;

		System.out.println("Last line of constructor of Box object.");
	}

	double volume()
	{
		return (width*depth*height);
	}

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Inside finialize method of Box object.");
	}
}