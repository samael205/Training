package com.rahulmadbhavi.training;

public class Circle
{
	private double radius;
	
	public Circle()
	{
		radius = 0.0;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return (Math.PI * radius * radius);
	}
}
