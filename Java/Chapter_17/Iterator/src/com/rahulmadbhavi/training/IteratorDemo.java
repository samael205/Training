
package com.rahulmadbhavi.training;

import java.util.LinkedList;
import java.util.Iterator;

class IteratorDemo
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		Iterator<String> iterator;

		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		System.out.println("iterator = list.iterator();");
		iterator = list.iterator();
		System.out.println();

		System.out.println("iterator.hasNext() : " + iterator.hasNext());
		System.out.println();

		System.out.println("list.add(\"A\") : " + list.add("A"));
		System.out.println("list.add(\"B\") : " + list.add("B"));
		System.out.println("list.add(\"C\") : " + list.add("C"));
		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		System.out.println("iterator = list.iterator();");
		iterator = list.iterator();
		System.out.println();

		System.out.println("iterator.hasNext() : " + iterator.hasNext());
		System.out.println();

		System.out.println("iterator.next() : " + iterator.next());
		System.out.println();

		System.out.println("iterator.next() : " + iterator.next());
		System.out.println("iterator.remove();");
		iterator.remove();
		System.out.println();

		System.out.println("list : " + list);
		System.out.println();
	}
}