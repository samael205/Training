
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");

		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		Collections.addAll(list, "D", "E", "F");

		System.out.println("list : " + list);
		System.out.println();
	}
}