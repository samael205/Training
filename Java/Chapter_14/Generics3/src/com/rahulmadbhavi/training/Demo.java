
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iOb = new Stats<Integer>(inums);
		double v = iOb.average();
		System.out.println("Average : " + v);

		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dOb = new Stats<Double>(dnums);
		v = dOb.average();
		System.out.println("Average : " + v);
	}
}