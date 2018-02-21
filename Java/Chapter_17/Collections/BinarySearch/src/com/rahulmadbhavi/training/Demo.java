
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("D");
		list.add("F");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("B");

		System.out.println("list : " + list);
		System.out.println();

		int index = Collections.binarySearch(list, "A");

		System.out.println("\"A\" is available at index : " + index);
		System.out.println();
	}
}