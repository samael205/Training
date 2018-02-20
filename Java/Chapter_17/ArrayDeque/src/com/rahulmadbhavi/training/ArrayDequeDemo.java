
package com.rahulmadbhavi.training;

import java.util.ArrayDeque;
import java.util.Iterator;

class ArrayDequeDemo
{
	public static void main(String args[])
	{
		ArrayDeque<String> arrayDeque1 = new ArrayDeque<String>();
		Iterator<String> iterator;

		System.out.println();

		System.out.println("arrayDeque1.isEmpty() : " + arrayDeque1.isEmpty());
		System.out.println();

		System.out.println("arrayDeque1.add(\"B\") : " + arrayDeque1.add("B"));
		System.out.println("arrayDeque1.add(\"C\") : " + arrayDeque1.add("C"));
		System.out.println("arrayDeque1.add(\"E\") : " + arrayDeque1.add("E"));
		System.out.println("arrayDeque1.add(\"G\") : " + arrayDeque1.add("G"));
		System.out.println();

		System.out.println("arrayDeque1.size() : " + arrayDeque1.size());
		System.out.println();

		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.addFirst(\"A\");");
		arrayDeque1.addFirst("A");
		System.out.println();

		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.addLast(\"H\");");
		arrayDeque1.addLast("H");
		System.out.println();
		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.contains(\"C\") : " + arrayDeque1.contains("C"));
		System.out.println("arrayDeque1.contains(\"D\") : " + arrayDeque1.contains("D"));
		System.out.println();

		System.out.println("Iterating through arrayDeque1");
		iterator = arrayDeque1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}		
		System.out.println();

		System.out.println("Reverse iteration through arrayDeque1");
		iterator = arrayDeque1.descendingIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("arrayDeque1.element() : " + arrayDeque1.element());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.getFirst() : " + arrayDeque1.getFirst());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.getLast() : " + arrayDeque1.getLast());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.offer(\"I\") : " + arrayDeque1.offer("I"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.offerFirst(\"J\") : " + arrayDeque1.offerFirst("J"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.offerLast(\"K\") : " + arrayDeque1.offerLast("K"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.peek() : " + arrayDeque1.peek());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.peekFirst() : " + arrayDeque1.peekFirst());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.peekLast() : " + arrayDeque1.peekLast());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.poll() : " + arrayDeque1.poll());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.pollFirst() : " + arrayDeque1.pollFirst());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.pollLast() : " + arrayDeque1.pollLast());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.pop() : " + arrayDeque1.pop());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.push(\"A\")");
		arrayDeque1.push("A");
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.remove() : " + arrayDeque1.remove());
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque.remove(\"E\") : " + arrayDeque1.remove("E"));		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque.remove(\"E\") : " + arrayDeque1.remove("E"));		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque.removeFirst() : " + arrayDeque1.removeFirst());		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque.removeLast() : " + arrayDeque1.removeLast());		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.add(\"C\") : " + arrayDeque1.add("C"));
		System.out.println("arrayDeque1.add(\"H\") : " + arrayDeque1.add("H"));
		System.out.println("arrayDeque1.add(\"H\") : " + arrayDeque1.add("H"));
		System.out.println("arrayDeque1.add(\"H\") : " + arrayDeque1.add("H"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.removeFirstOccurrence(\"H\") : " + arrayDeque1.removeFirstOccurrence("H"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque1.removeLastOccurrence(\"H\") : " + arrayDeque1.removeLastOccurrence("H"));
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("arrayDeque.remove(\"H\") : " + arrayDeque1.remove("H"));		
		System.out.println("arrayDeque1 : " + arrayDeque1);
		System.out.println();

		System.out.println("Converting to array");
		String letters[] = new String[arrayDeque1.size()];
		letters = arrayDeque1.toArray(letters);
		for(int i=0; i<letters.length; i++)
		{
			System.out.println("letters[" + i + "] : " + letters[i]);
		}
		System.out.println();

		System.out.println("arrayDeque1.clear()");
		arrayDeque1.clear();
		System.out.println();

		System.out.println("arrayDeque1.size() : " + arrayDeque1.size());
		System.out.println();
	}
}