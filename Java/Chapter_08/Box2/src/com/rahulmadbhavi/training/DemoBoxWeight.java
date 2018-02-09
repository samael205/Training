
package com.rahulmadbhavi.training;

class DemoBoxWeight
{
	public static void main(String args[])
	{
		BoxWeight myBox = new BoxWeight(10, 20, 15, 34.3);
		Box box;

		double vol;

		vol = myBox.volume();
		System.out.println("Volume of myBox : " + vol + " cu. units.");
		System.out.println("Weight of myBox : " + myBox.weight);
		System.out.println();

		box = myBox;

		vol = box.volume();
		System.out.println("Volume of myBox : " + vol + " cu. units.");
		// Next line creates an error since weight is not defined in Box class
		// System.out.println("Weight of myBox : " + box.weight);
		System.out.println();		
	}
}