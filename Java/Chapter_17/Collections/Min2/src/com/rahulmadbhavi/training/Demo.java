
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);

		System.out.println();

		System.out.println("list.add(2);");
		System.out.println("list.add(3);");
		System.out.println("list.add(4);");
		System.out.println("list.add(1);");
		System.out.println();

		System.out.println("Use min method with comparator argument.");
		System.out.println("Collections.min(list, Collections.reverseOrder()) : " + Collections.min(list, Collections.reverseOrder()));
		System.out.println();
	}
}