
package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.Collections;

class Demo
{
	public static void main(String args[])
	{
		ArrayList<Box> list = new ArrayList<Box>();
		Box box;

		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		System.out.println("list.add(new Box(6.0)) : " + list.add(new Box(6.0)));
		System.out.println("list : " + list);
		System.out.println();

		System.out.println("list.add(new Box(4.0)) : " + list.add(new Box(4.0)));
		System.out.println("list : " + list);
		System.out.println();

		System.out.println("list.add(new Box(5.0)) : " + list.add(new Box(5.0)));
		System.out.println("list : " + list);
		System.out.println();

		System.out.println("list.add(new Box(7.0)) : " + list.add(new Box(7.0)));
		System.out.println("list : " + list);
		System.out.println();

		Collections.sort(list, new SortByVolume());
		System.out.println("Sorted list : " + list);
		System.out.println();

	}
}