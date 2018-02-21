
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void printList(ArrayList<Student> list)
	{
		for(Student student : list)
		{
			System.out.println(student);
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "John Doe", 23));
		list.add(new Student(106, "Tom Smith", 27));
		list.add(new Student(105, "Jane Baker", 21));
		list.add(new Student(107, "Tom Hall", 24));
		list.add(new Student(103, "Ralph Smith", 25));

		System.out.println();

		System.out.println("List of students : ");
		printList(list);

		System.out.println("List of students sorted by name : ");
		Collections.sort(list, new NameComparator());
		printList(list);

		System.out.println("List of students sorted by age : ");
		Collections.sort(list, new AgeComparator());
		printList(list);

	}
}