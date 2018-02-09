
package com.rahulmadbhavi.training;

class BoxWeight extends Box
{
	double weight;

	BoxWeight(BoxWeight boxWeight)
	{
		super(boxWeight);
		this.weight = boxWeight.weight;
	}

	BoxWeight(double width, double depth, double height, double weight)
	{
		super(width, depth, height);
		this.weight = weight;
	}

	BoxWeight()
	{
		super();
		this.weight = -1;
	}

	BoxWeight(double length, double weight)
	{
		super(length);
		this.weight = weight;
	}
}