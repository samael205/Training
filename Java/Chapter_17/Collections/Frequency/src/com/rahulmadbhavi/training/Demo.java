
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("D");
		list.add("C");
		list.add("A");
		list.add("C");
		list.add("C");
		list.add("B");

		System.out.println("list : " + list);
		System.out.println();

		int frequency = Collections.frequency(list, "C");

		System.out.println("Number of \"C\" in list : " + frequency);
		System.out.println();
	}
}