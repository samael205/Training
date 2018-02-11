
package com.rahulmadbhavi.training;

class EnumDemo
{
	public static void main(String args[])
	{
		System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.");

		System.out.println("All Prices");
		for(Apple apple : Apple.values())
		{
			System.out.println(apple + " costs " + apple.getPrice() + " cents.");
		}
	}
}