
package com.rahulmadbhavi.training;

import java.util.concurrent.Callable;

public class Hypotenuse implements Callable<Double>
{
	double side1, side2;

	public Hypotenuse(double side1, double side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public Double call()
	{
		return Math.sqrt((side1 * side1) + (side2 * side2));
	}
}
