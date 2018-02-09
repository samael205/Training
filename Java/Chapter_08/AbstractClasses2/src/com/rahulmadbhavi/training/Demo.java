
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Rectangle rectangle = new Rectangle(9, 5);
		Figure figure;

		figure = rectangle;

		System.out.println("Area is : " + figure.area());
	}
}