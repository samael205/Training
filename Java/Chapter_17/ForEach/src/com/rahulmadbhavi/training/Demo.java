
package com.rahulmadbhavi.training;

import java.util.LinkedList;

class Demo
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();

		System.out.println();

		System.out.println("list.add(\"A\") : " + list.add("A"));
		System.out.println("list.add(\"B\") : " + list.add("B"));
		System.out.println("list.add(\"C\") : " + list.add("C"));
		System.out.println("list.add(\"D\") : " + list.add("D"));
		System.out.println("list.add(\"E\") : " + list.add("E"));

		System.out.println();

		System.out.println("Contents of list : ");
		for(String string : list)
		{
			System.out.println(string);
		}
		System.out.println();
	}
}