
package com.rahulmadbhavi.training;

class EnumDemo
{
	public static void main(String args[])
	{
		Apple ap;

		System.out.println("Here are all Apple constants.");

		for(Apple apple : Apple.values())
		{
			System.out.println(apple);
		}

		System.out.println();

		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}