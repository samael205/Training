package com.rahulmadbhavi.training;

public class BoxDemo
{
	public static void main(String args[])
	{
		Box myBox = new Box();
		double volume;
		
		// Assign values to myBox's instance variables
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		// Compute volume of the box
		volume = myBox.width * myBox.height * myBox.depth;
		
		System.out.println("Volume is " + volume);
	}
}
