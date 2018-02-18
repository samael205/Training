
package com.rahulmadbhavi.training;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class LinkedListDemo
{
	public static void printLinkedList(List<String> list)
	{
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		List<String> linkedList = new LinkedList<String>();
		List<String> linkedList2 = new LinkedList<String>();

		System.out.println();

		System.out.println("linkedList.isEmpty() : " + linkedList.isEmpty());
		System.out.println();

		System.out.println("linkedList.add(\"One\")   : " + linkedList.add("One"));
		System.out.println("linkedList.add(\"Two\")   : " + linkedList.add("Two"));
		System.out.println("linkedList.add(\"Three\") : " + linkedList.add("Three"));
		System.out.println("linkedList.add(\"Four\")  : " + linkedList.add("Four"));
		System.out.println("linkedList.add(\"Five\")  : " + linkedList.add("Five"));
		System.out.println();

		System.out.println("linkedList contains : ");
		printLinkedList(linkedList);
		
		System.out.println("linkedList.isEmpty() : " + linkedList.isEmpty());
		System.out.println();

		System.out.println("linkedList.size() : " + linkedList.size());
		System.out.println();

		System.out.println("linkedList2.add(\"Six\")    : " + linkedList2.add("Six"));
		System.out.println("linkedList2.add(\"Seven\")  : " + linkedList2.add("Seven"));
		System.out.println("linkedList2.add(\"Eight\")  : " + linkedList2.add("Eight"));
		System.out.println("linkedList2.add(\"Nine\")   : " + linkedList2.add("Nine"));
		System.out.println("linkedList2.add(\"Ten\")    : " + linkedList2.add("Ten"));
		System.out.println("linkedList2.add(\"Eleven\") : " + linkedList2.add("Eleven"));
		System.out.println();

		System.out.println("linkedList2 contains : ");
		printLinkedList(linkedList2);
		
		System.out.println("linkedList2.remove(\"Eleven\") : " + linkedList2.remove("Eleven"));
		System.out.println();

		System.out.println("linkedList2 contains : ");
		printLinkedList(linkedList2);
		
		System.out.println("linkedList2.addAll(linkedList) : " + linkedList2.addAll(linkedList));
		System.out.println();

		System.out.println("linkedList2 contains : ");
		printLinkedList(linkedList2);

		System.out.println("linkedList2.contains(\"Eleven\") : " + linkedList2.contains("Eleven"));
		System.out.println("linkedList2.contains(\"Ten\") : " + linkedList2.contains("Ten"));
		System.out.println();

		System.out.println("linkedList2.retainAll(linkedList) : " + linkedList2.retainAll(linkedList));
		System.out.println();

		System.out.println("linkedList2 contains : ");
		printLinkedList(linkedList2);

		System.out.println("linkedlist2.clear();");
		linkedList2.clear();
		System.out.println();

		System.out.println("linkedList2.size() : " + linkedList2.size());
		System.out.println();

		System.out.println("linkedList contains : ");
		printLinkedList(linkedList);

		System.out.println("Converting linkedList to object array");
		String numbers[] = new String[linkedList.size()];
		numbers = linkedList.toArray(numbers);
		System.out.println("Array contains : ");
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("numbers[" + i + "] : " + numbers[i]);
		}
		System.out.println();

		System.out.println("linkedList : " + linkedList);
		System.out.println();

		System.out.println("linkedList.get(2) : " + linkedList.get(2));
		System.out.println();

		System.out.println("linkedList.set(1, \"Four\") : " + linkedList.set(1, "Four"));
		System.out.println();

		System.out.println("linkedList : " + linkedList);
		System.out.println();

		System.out.println("linkedList.indexOf(\"Four\") : " + linkedList.indexOf("Four"));
		System.out.println();

		System.out.println("linkedList.lastIndexOf(\"Four\") : " + linkedList.lastIndexOf("Four"));
		System.out.println();

		LinkedList<String> linkedList3 = new LinkedList<String>(linkedList.subList(1, 5));
		System.out.println("linkedList3 = linkedList.subList(1, 5);");
		System.out.println();

		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.element() : " + linkedList3.element());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.peek() : " + linkedList3.peek());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.poll() : " + linkedList3.poll());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.remove() : " + linkedList3.remove());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.addFirst(\"Five\")");
		System.out.println("(Throws IllegalStateException if capacity restricted deque is out of space.)");
		linkedList3.addFirst("Five");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.addLast(\"Six\")");
		System.out.println("(Throws IllegalStateException if capacity restricted deque is out of space.)");
		linkedList3.addLast("Six");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.offerFirst(\"One\") : " + linkedList3.offerFirst("One"));
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.offerLast(\"Seven\") : " + linkedList3.offerLast("Seven"));
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.getFirst() : " + linkedList3.getFirst());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.getLast() : " + linkedList3.getLast());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.peekFirst() : " + linkedList3.peekFirst());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.peekLast() : " + linkedList3.peekLast());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.pollFirst() : " + linkedList3.pollFirst());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.pollLast() : " + linkedList3.pollLast());
		System.out.println("(Returns null if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		linkedList3.push("Zero");
		System.out.println("linkedList3.push(\"Zero\");");
		System.out.println("(Throws IllegalStateException if capacity restricted deque is out of space.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.set(4, \"Five\") : " + linkedList3.set(4, "Five"));
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.pop() : " + linkedList3.pop());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		linkedList3.addFirst("Zero");
		System.out.println("linkedList3.addFirst(\"Zero\");");
		System.out.println("(Throws IllegalStateException if capacity restricted deque is out of space.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		linkedList3.addLast("Eleven");
		System.out.println("linkedList3.addLast(\"Eleven\");");
		System.out.println("(Throws IllegalStateException if capacity restricted deque is out of space.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.removeFirst() : " + linkedList3.removeFirst());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.removeLast() : " + linkedList3.removeLast());
		System.out.println("(Throws NoSuchElementException if LinkedList is empty.)");
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.removeFirstOccurrence(\"Five\") : " + linkedList3.removeFirstOccurrence("Five"));
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println("linkedList3.removeLastOccurrence(\"Five\") : " + linkedList3.removeLastOccurrence("Five"));
		System.out.println("linkedList3 : " + linkedList3);
		System.out.println();

		System.out.println();
	}
}