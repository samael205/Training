
package com.rahulmadbhavi.training;

class BoxDemo3
{
	public static void main(String args[])
	{
		// Create Box Objects
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		// Assigning Box Object Values
		myBox1.width	= 10;
		myBox1.height	= 20;
		myBox1.depth	= 15;

		myBox2.width	= 3;
		myBox2.height	= 6;
		myBox2.depth	= 9;

		// Display Volumes
		myBox1.volume();
		myBox2.volume();
	}
}