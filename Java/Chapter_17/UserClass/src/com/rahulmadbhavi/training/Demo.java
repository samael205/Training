
package com.rahulmadbhavi.training;

import java.util.LinkedList;

class Demo
{
	public static void main(String args[])
	{
		LinkedList<Box> list = new LinkedList<Box>();

		Box box1 = new Box(3.0, 4.0, 5.0);
		Box box2 = new Box(1.0);
		Box box3 = new Box(0.0);

		System.out.println();

		System.out.println("list.add(box1) : " + list.add(box1));
		System.out.println("list.add(box2) : " + list.add(box2));
		System.out.println("list.add(box3) : " + list.add(box3));

		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		System.out.println("Contents of list : ");
		for(Box box : list)
		{
			System.out.println(box);
		}
		System.out.println();
	}
}