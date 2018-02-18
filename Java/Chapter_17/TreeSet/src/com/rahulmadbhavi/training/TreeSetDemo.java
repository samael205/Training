
package com.rahulmadbhavi.training;

import java.util.TreeSet;
import java.util.Iterator;

class TreeSetDemo
{
	public static void main(String args[])
	{
		TreeSet<String> treeSet1 = new TreeSet<String>();
		TreeSet<String> treeSet2 = new TreeSet<String>();
		Iterator<String> iterator;

		System.out.println();

		System.out.println("treeSet1.isEmpty() : " + treeSet1.isEmpty());
		System.out.println();

		System.out.println("treeSet1.add(\"A\") : " + treeSet1.add("A"));
		System.out.println("treeSet1.add(\"C\") : " + treeSet1.add("C"));
		System.out.println("treeSet1.add(\"E\") : " + treeSet1.add("E"));
		System.out.println("treeSet1.add(\"G\") : " + treeSet1.add("G"));
		System.out.println();

		System.out.println("treeSet2.add(\"B\") : " + treeSet2.add("B"));
		System.out.println("treeSet2.add(\"D\") : " + treeSet2.add("D"));
		System.out.println("treeSet2.add(\"F\") : " + treeSet2.add("F"));
		System.out.println("treeSet2.add(\"H\") : " + treeSet2.add("H"));
		System.out.println();

		System.out.println("treeSet1 : " + treeSet1);
		System.out.println();

		System.out.println("treeSet2 : " + treeSet2);
		System.out.println();

		System.out.println("treeSet1.isEmpty() : " + treeSet1.isEmpty());
		System.out.println();

		System.out.println("treeSet.size() : " + treeSet1.size());
		System.out.println();

		System.out.println("treeSet1.contains(\"C\") : " + treeSet1.contains("C"));
		System.out.println();

		System.out.println("treeSet1.containsAll(treeSet2) : " + treeSet1.containsAll(treeSet2));
		System.out.println();

		System.out.println("treeSet1.ceiling(\"D\") : " + treeSet1.ceiling("D"));	
		System.out.println();

		System.out.println("treeSet1.floor(\"D\") : " + treeSet1.floor("D"));	
		System.out.println();

		System.out.println("treeSet1.addAll(treeSet2) : " + treeSet1.addAll(treeSet2));
		System.out.println();

		System.out.println("treeSet1 : " + treeSet1);
		System.out.println();

		System.out.println("treeSet2 : " + treeSet2);
		System.out.println();

		System.out.println("treeSet1.first() : " + treeSet1.first());
		System.out.println();

		System.out.println("treeSet1.last() : " + treeSet1.last());
		System.out.println();

		System.out.println("treeSet1.headSet(\"D\") : " + treeSet1.headSet("D"));
		System.out.println();

		System.out.println("treeSet1.headSet(\"D\", true) : " + treeSet1.headSet("D", true));
		System.out.println();

		System.out.println("treeSet1.tailSet(\"D\") : " + treeSet1.tailSet("D"));
		System.out.println();

		System.out.println("treeSet1.tailSet(\"D\", true) : " + treeSet1.tailSet("D", true));
		System.out.println();

		System.out.println("treeSet1.higher(\"G\") : " + treeSet1.higher("G"));
		System.out.println();

		System.out.println("treeSet1.higher(\"H\") : " + treeSet1.higher("H"));
		System.out.println();

		System.out.println("treeSet1.lower(\"B\") : " + treeSet1.lower("B"));
		System.out.println();

		System.out.println("treeSet1.lower(\"A\") : " + treeSet1.lower("A"));
		System.out.println();

		System.out.println("Iterating through treeSet1");
		iterator = treeSet1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("Reverse iteration through treeSet1");
		iterator = treeSet1.descendingIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("treeSet1.subSet(\"B\", \"G\")               : " + treeSet1.subSet("B", "G"));
		System.out.println("treeSet1.subSet(\"B\", true, \"G\", true)   : " + treeSet1.subSet("B", true, "G", true));
		System.out.println("treeSet1.subSet(\"B\", true, \"G\", false)  : " + treeSet1.subSet("B", true, "G", false));
		System.out.println("treeSet1.subSet(\"B\", false, \"G\", true)  : " + treeSet1.subSet("B", false, "G", true));
		System.out.println("treeSet1.subSet(\"B\", false, \"G\", false) : " + treeSet1.subSet("B", false, "G", false));
		System.out.println();

		System.out.println("Converting treeSet1 to array");
		String letters[] = new String[treeSet1.size()];
		letters = treeSet1.toArray(letters);
		for(int i=0; i<letters.length; i++)
		{
			System.out.println("letters[" + i + "] : " + letters[i]);
		}
		System.out.println();

		System.out.println("treeSet1.pollFirst() : " + treeSet1.pollFirst());
		System.out.println();

		System.out.println("treeSet1 : " + treeSet1);
		System.out.println();

		System.out.println("treeSet1.pollLast() : " + treeSet1.pollLast());
		System.out.println();

		System.out.println("treeSet1 : " + treeSet1);
		System.out.println();

		System.out.println("treeSet2.clear();");
		treeSet2.clear();
		System.out.println();

		System.out.println("treeSet2.isEmpty() : " + treeSet2.isEmpty());
		System.out.println();
	}
}