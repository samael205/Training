
package com.rahulmadbhavi.training;

import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet<String> hashSet1 = new HashSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>();

		System.out.println();

		System.out.println("hashSet1.isEmpty() : " + hashSet1.isEmpty());		
		System.out.println();

		System.out.println("hashSet1.add(\"One\")   : " + hashSet1.add("One"));
		System.out.println("hashSet1.add(\"Two\")   : " + hashSet1.add("Two"));
		System.out.println("hashSet1.add(\"Three\") : " + hashSet1.add("Three"));
		System.out.println("hashSet1.add(\"Four\")  : " + hashSet1.add("Four"));
		System.out.println("hashSet1.add(\"Five\")  : " + hashSet1.add("Five"));
		System.out.println();

		System.out.println("hashSet2.add(\"Five\") : " + hashSet2.add("Five"));
		System.out.println("hashSet2.add(\"Six\")  : " + hashSet2.add("Six"));
		System.out.println();

		System.out.println("hashSet1.size() : " + hashSet1.size());
		System.out.println();

		System.out.println("hashSet1 : " + hashSet1 + "\n");
		System.out.println("hashSet2 : " + hashSet2 + "\n");

		System.out.println("hashSet1.add(\"Five\")  : " + hashSet1.add("Five"));
		System.out.println();

		System.out.println("hashSet1.size() : " + hashSet1.size());
		System.out.println();

		System.out.println("hashSet1 : " + hashSet1 + "\n");

		System.out.println("hashSet1.contains(\"Three\") : " + hashSet1.contains("Three"));
		System.out.println("hashSet1.contains(\"Six\")   : " + hashSet1.contains("Six"));
		System.out.println();

		System.out.println("hashSet1.remove(\"Five\") : " + hashSet1.remove("Five"));
		System.out.println("hashSet1 : " + hashSet1 + "\n");

		System.out.println("hashSet1.remove(\"Five\") : " + hashSet1.remove("Five"));
		System.out.println("hashSet1 : " + hashSet1 + "\n");

		Iterator<String> iterator = hashSet1.iterator();
		System.out.println("Contents of hashSet1 using iterator : ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("hashSet1 : " + hashSet1 + "\n");
		System.out.println("hashSet2 : " + hashSet2 + "\n");

		System.out.println("hashSet1.addAll(hashSet2);");
		hashSet1.addAll(hashSet2);
		System.out.println();

		System.out.println("hashSet1 : " + hashSet1 + "\n");
		System.out.println("hashSet2 : " + hashSet2 + "\n");

		System.out.println("hashSet1.containsAll(hashSet2) : " + hashSet1.containsAll(hashSet2));
		System.out.println();

		System.out.println("hashSet1 : " + hashSet1 + "\n");
		System.out.println("hashSet2 : " + hashSet2 + "\n");

		System.out.println("Converting set to array : ");
		String numbers[] = new String[hashSet1.size()];
		numbers = hashSet1.toArray(numbers);
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("numbers[" + i + "] : " + numbers[i]);
		}
		System.out.println();

		System.out.println("hashSet1.clear();\n");
		hashSet1.clear();

		System.out.println("hashSet1 : " + hashSet1 + "\n");

	}
}