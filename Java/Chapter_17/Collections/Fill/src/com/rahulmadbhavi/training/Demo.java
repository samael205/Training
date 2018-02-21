
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

		Collections.fill(list, "X");

		System.out.println("list : " + list);
		System.out.println();
	}
}