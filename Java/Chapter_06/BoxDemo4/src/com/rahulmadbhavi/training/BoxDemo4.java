
package com.rahulmadbhavi.training;

class BoxDemo4
{
	public static void main(String args[])
	{
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		myBox1.width = 10;
		myBox1.depth = 20;
		myBox1.height = 15;

		myBox2.width = 3;
		myBox2.depth = 6;
		myBox2.height = 9;

		System.out.println("Volume of first box is " + myBox1.volume() + " cu. units.");
		System.out.println("Volume of second box is " + myBox2.volume() + " cu. units.");
	}
}