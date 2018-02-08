
package com.rahulmadbhavi.training;

class ConstructorOverload
{
	public static void main(String args[])
	{
		Box myBox1 = new Box(10, 12, 15);
		Box myBox2 = new Box();
		Box myBox3 = new Box(10);

		double vol;

		vol = myBox1.volume();
		System.out.println("Volume of box 1 is " + vol + " cu. units.");

		vol = myBox2.volume();
		System.out.println("Volume of box 2 is " + vol + " cu. units.");

		vol = myBox3.volume();
		System.out.println("Volume of box 3 is " + vol + " cu. units.");
	}
}