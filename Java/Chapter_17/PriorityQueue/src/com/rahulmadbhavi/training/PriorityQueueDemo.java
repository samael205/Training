
package com.rahulmadbhavi.training;

import java.util.PriorityQueue;
import java.util.Iterator;

class PriorityQueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();
		PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>();
		Iterator<String> iterator;

		System.out.println();

		System.out.println("priorityQueue1.isEmpty() : " + priorityQueue1.isEmpty());
		System.out.println();

		System.out.println("priorityQueue1.add(\"A\") : " + priorityQueue1.add("A"));
		System.out.println("priorityQueue1.add(\"C\") : " + priorityQueue1.add("C"));
		System.out.println("priorityQueue1.add(\"E\") : " + priorityQueue1.add("E"));
		System.out.println("priorityQueue1.add(\"G\") : " + priorityQueue1.add("G"));
		System.out.println("priorityQueue1.add(\"H\") : " + priorityQueue1.add("H"));
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();

		System.out.println("priorityQueue1.size() : " + priorityQueue1.size());
		System.out.println();

		System.out.println("priorityQueue1.contains(\"A\") : " + priorityQueue1.contains("A"));
		System.out.println("priorityQueue1.contains(\"B\") : " + priorityQueue1.contains("B"));
		System.out.println();

		System.out.println("priorityQueue1.peek() : " + priorityQueue1.peek());
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();

		System.out.println("priorityQueue1.poll() : " + priorityQueue1.poll());
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();

		System.out.println("Converting priorityQueue1 to array");
		iterator = priorityQueue1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("priorityQueue1.remove(\"C\") : " + priorityQueue1.remove("C"));
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();

		System.out.println("priorityQueue1.remove(\"C\") : " + priorityQueue1.remove("C"));
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();

		System.out.println("priorityQueue1.clear();");
		priorityQueue1.clear();
		System.out.println();

		System.out.println("priorityQueue1 : " + priorityQueue1);
		System.out.println();
	}
}