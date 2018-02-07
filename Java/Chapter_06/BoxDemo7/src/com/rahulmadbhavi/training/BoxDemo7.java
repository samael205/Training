
package com.rahulmadbhavi.training;

class BoxDemo7
{
	public static void main(String args[])
	{
		Box myBox1 = new Box();
		Box myBox2 = new Box(3, 6, 9);

		System.out.println("Volume of box 1 is " + myBox1.volume() + " cu. units.");
		System.out.println("Volume of box 2 is " + myBox2.volume() + " cu. units.");
	}
}