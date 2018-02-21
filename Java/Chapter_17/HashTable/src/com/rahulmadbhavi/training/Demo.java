
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Hashtable<Integer, Double> table = new Hashtable<Integer, Double>();

		System.out.println();

		System.out.println("table.isEmpty() : " + table.isEmpty());
		System.out.println();

		System.out.println("table.put(1, 1.0) : " + table.put(1, 1.0));
		System.out.println("table.put(2, 2.0) : " + table.put(2, 2.0));
		System.out.println("table.put(3, 3.0) : " + table.put(3, 3.0));
		System.out.println("table.put(4, 4.0) : " + table.put(4, 4.0));
		System.out.println("table.put(5, 5.0) : " + table.put(5, 5.0));
		System.out.println();

		System.out.println("table : " + table);
		System.out.println();

		System.out.println("table.containsKey(4) : " + table.containsKey(4));
		System.out.println("table.containsKey(8) : " + table.containsKey(8));
		System.out.println();

		System.out.println("table.containsValue(4.0) : " + table.containsValue(4.0));
		System.out.println("table.containsValue(8.0) : " + table.containsValue(8.0));
		System.out.println();

		System.out.println("table.get(4) : " + table.get(4));
		System.out.println("table : " + table);
		System.out.println();

		System.out.println("table.size() : " + table.size());
		System.out.println();

		System.out.println("table.remove(3) : " + table.remove(3));
		System.out.println("table : " + table);
		System.out.println();

		System.out.println("table.clear();");
		table.clear();
		System.out.println();

		System.out.println("table : " + table);
		System.out.println();
	}
}