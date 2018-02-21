
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

		Collections.replaceAll(list, "C", "X");

		System.out.println("Replacing all \"C\" in list with \"X\" : " + list);
		System.out.println();
	}
}