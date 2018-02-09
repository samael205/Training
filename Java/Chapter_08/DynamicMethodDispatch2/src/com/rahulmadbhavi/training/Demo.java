
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Figure figure = new Figure(10, 10);
		Rectangle rectangle = new Rectangle(9, 5);
		Triangle triangle = new Triangle(10, 8);

		Figure tempFigure;

		tempFigure = figure;
		System.out.println("Area is " + tempFigure.area());

		tempFigure = rectangle;
		System.out.println("Area is " + tempFigure.area());

		tempFigure = triangle;
		System.out.println("Area is " + tempFigure.area());
	}
}