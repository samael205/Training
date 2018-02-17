
package com.rahulmadbhavi.training;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo
{
	public static void printArrayList(List<String> list)
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
		List<String> arrayList = new ArrayList<String>();
		List<String> arrayList2 = new ArrayList<String>();
		List<String> arrayList3 = new ArrayList<String>();

		System.out.println();

		System.out.println("arrayList.isEmpty() : " + arrayList.isEmpty());
		System.out.println();

		System.out.println("arrayList.add(\"One\")   : " + arrayList.add("One"));
		System.out.println("arrayList.add(\"Two\")   : " + arrayList.add("Two"));
		System.out.println("arrayList.add(\"Three\") : " + arrayList.add("Three"));
		System.out.println("arrayList.add(\"Four\")  : " + arrayList.add("Four"));
		System.out.println("arrayList.add(\"Five\")  : " + arrayList.add("Five"));
		System.out.println();

		System.out.println("arrayList2.add(\"Six\")   : " + arrayList2.add("Six"));
		System.out.println("arrayList2.add(\"Seven\") : " + arrayList2.add("Seven"));
		System.out.println("arrayList2.add(\"Eight\") : " + arrayList2.add("Eight"));
		System.out.println("arrayList2.add(\"Nine\")  : " + arrayList2.add("Nine"));
		System.out.println("arrayList2.add(\"Ten\")   : " + arrayList2.add("Ten"));
		System.out.println();

		System.out.println("arrayList.isEmpty() : " + arrayList.isEmpty());
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		System.out.println("arrayList2 contains : ");
		printArrayList(arrayList2);

		System.out.println("arrayList.addAll(arrayList2) : " + arrayList.addAll(arrayList2));
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);		

		System.out.println("arrayList.contains(\"Eleven\") : " + arrayList.contains("Eleven"));
		System.out.println("arrayList.contains(\"Four\")   : " + arrayList.contains("Four"));
		System.out.println();

		System.out.println("arrayList.containsAll(arrayList2) : " + arrayList.containsAll(arrayList2));
		System.out.println();

		System.out.println("arrayList2.add(\"Eleven\")   : " + arrayList2.add("Eleven"));
		System.out.println();

		System.out.println("arrayList2 contains : ");
		printArrayList(arrayList2);

		System.out.println("arrayList.containsAll(arrayList2) : " + arrayList.containsAll(arrayList2));
		System.out.println();

		System.out.println("arrayList2.remove(\"Eleven\") : " + arrayList2.remove("Eleven"));
		System.out.println();

		System.out.println("arrayList2 contains : ");
		printArrayList(arrayList2);

		System.out.println("arrayList.removeAll(arrayList2) : " + arrayList.removeAll(arrayList2));
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		System.out.println("arrayList.size() : " + arrayList.size());
		System.out.println();

		System.out.println("arrayList2.add(\"Three\") : " + arrayList2.add("Three"));
		System.out.println("arrayList2.add(\"Four\")  : " + arrayList2.add("Four"));
		System.out.println("arrayList2.add(\"Five\")  : " + arrayList2.add("Five"));
		System.out.println();

		System.out.println("arrayList2 contains : ");
		printArrayList(arrayList2);

		System.out.println("arrayList2.retainAll(arrayList) : " + arrayList2.retainAll(arrayList));
		System.out.println();

		System.out.println("arrayList2 contains : ");
		printArrayList(arrayList2);

		String numbers[] = new String[arrayList.size()];
		numbers = arrayList.toArray(numbers);
		System.out.println("Using toArray() to convert to array");
		System.out.println();
		System.out.println("Printing array of strings : ");
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("numbers[" + i + "] : " + numbers[i]);
		}
		System.out.println();

		System.out.println("arrayList2.clear()");
		arrayList2.clear();
		System.out.println();

		System.out.println("arrayList2.size() : " + arrayList2.size());
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		System.out.println("arrayList.add(2, \"Four\")");
		arrayList.add(2, "Four");
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		System.out.println("arrayList.get(3) : " + arrayList.get(3));
		System.out.println();

		System.out.println("arrayList.indexOf(\"Four\") : " + arrayList.indexOf("Four"));
		System.out.println();

		System.out.println("arrayList.lastIndexOf(\"Four\") : " + arrayList.lastIndexOf("Four"));
		System.out.println();

		System.out.println("arrayList.remove(2) : " + arrayList.remove(2));
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		System.out.println("arrayList.set(2, \"Six\") : " + arrayList.set(2, "Six"));
		System.out.println();

		System.out.println("arrayList contains : ");
		printArrayList(arrayList);

		arrayList3 = arrayList.subList(2, 5);
		System.out.println("arrayList3 = (ArrayList<String>) arrayList.subList(2, 5);");
		System.out.println();

		System.out.println("arrayList3 contains : ");
		printArrayList(arrayList3);

		System.out.println("arrayList3 : " + arrayList3);
		System.out.println();
	}
}