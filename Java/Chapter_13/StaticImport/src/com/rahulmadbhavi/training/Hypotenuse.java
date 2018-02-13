
package com.rahulmadbhavi.training;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Hypotenuse
{
	public static void main(String args[])
	{
		double side1 = 3.0;
		double side2 = 4.0;
		double side3;

		side3 = sqrt(pow(side1, 2) + pow(side2, 2));

		System.out.println("Triangle dimensions");
		System.out.println("Side 1 : " + side1);
		System.out.println("Side 2 : " + side2);
		System.out.println("Hypotenuse : " + side3);
	}
}