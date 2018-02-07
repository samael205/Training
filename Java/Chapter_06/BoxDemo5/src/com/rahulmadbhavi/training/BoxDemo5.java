
package com.rahulmadbhavi.training;

class BoxDemo5
{
	public static void main(String args[])
	{
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.setDim(10, 20, 15);
		myBox2.setDim(3, 6, 9);

		System.out.println("Volume of Box 1 is " + myBox1.volume() + " cu. units.");
		System.out.println("Volume of Box 2 is " + myBox2.volume() + " cu. units.");
	}
}