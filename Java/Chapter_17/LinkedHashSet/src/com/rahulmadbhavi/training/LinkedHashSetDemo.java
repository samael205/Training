
package com.rahulmadbhavi.training;

import java.util.LinkedHashSet;
import java.util.Iterator;

class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
		LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>();

		System.out.println();

		System.out.println("linkedHashSet1.isEmpty() : " + linkedHashSet1.isEmpty());		
		System.out.println();

		System.out.println("linkedHashSet1.add(\"One\")   : " + linkedHashSet1.add("One"));
		System.out.println("linkedHashSet1.add(\"Two\")   : " + linkedHashSet1.add("Two"));
		System.out.println("linkedHashSet1.add(\"Three\") : " + linkedHashSet1.add("Three"));
		System.out.println("linkedHashSet1.add(\"Four\")  : " + linkedHashSet1.add("Four"));
		System.out.println("linkedHashSet1.add(\"Five\")  : " + linkedHashSet1.add("Five"));
		System.out.println();

		System.out.println("linkedHashSet2.add(\"Five\") : " + linkedHashSet2.add("Five"));
		System.out.println("linkedHashSet2.add(\"Six\")  : " + linkedHashSet2.add("Six"));
		System.out.println();

		System.out.println("linkedHashSet1.size() : " + linkedHashSet1.size());
		System.out.println();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");
		System.out.println("linkedHashSet2 : " + linkedHashSet2 + "\n");

		System.out.println("linkedHashSet1.add(\"Five\")  : " + linkedHashSet1.add("Five"));
		System.out.println();

		System.out.println("linkedHashSet1.size() : " + linkedHashSet1.size());
		System.out.println();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");

		System.out.println("linkedHashSet1.contains(\"Three\") : " + linkedHashSet1.contains("Three"));
		System.out.println("linkedHashSet1.contains(\"Six\")   : " + linkedHashSet1.contains("Six"));
		System.out.println();

		System.out.println("linkedHashSet1.remove(\"Five\") : " + linkedHashSet1.remove("Five"));
		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");

		System.out.println("linkedHashSet1.remove(\"Five\") : " + linkedHashSet1.remove("Five"));
		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");

		Iterator<String> iterator = linkedHashSet1.iterator();
		System.out.println("Contents of linkedHashSet1 using iterator : ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");
		System.out.println("linkedHashSet2 : " + linkedHashSet2 + "\n");

		System.out.println("linkedHashSet1.addAll(linkedHashSet2);");
		linkedHashSet1.addAll(linkedHashSet2);
		System.out.println();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");
		System.out.println("linkedHashSet2 : " + linkedHashSet2 + "\n");

		System.out.println("linkedHashSet1.containsAll(linkedHashSet2) : " + linkedHashSet1.containsAll(linkedHashSet2));
		System.out.println();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");
		System.out.println("linkedHashSet2 : " + linkedHashSet2 + "\n");

		System.out.println("Converting set to array : ");
		String numbers[] = new String[linkedHashSet1.size()];
		numbers = linkedHashSet1.toArray(numbers);
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("numbers[" + i + "] : " + numbers[i]);
		}
		System.out.println();

		System.out.println("linkedHashSet1.clear();\n");
		linkedHashSet1.clear();

		System.out.println("linkedHashSet1 : " + linkedHashSet1 + "\n");

	}
}