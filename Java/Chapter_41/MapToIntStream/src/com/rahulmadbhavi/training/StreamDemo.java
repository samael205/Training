package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		ArrayList<Double> myList = new ArrayList<>();
		
		myList.add(1.1);
		myList.add(3.6);
		myList.add(9.2);
		myList.add(4.7);
		myList.add(12.1);
		myList.add(5.0);
		
		System.out.print("Original values in myList : ");
		myList.stream().forEach((a) -> System.out.print(a + " "));
		System.out.println();
		
		// Map the ceiling of the elements in myList to an IntStream
		IntStream stream = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
		
		System.out.print("Ceiling values in myList : ");
		stream.forEach((a) -> System.out.print(a + " "));
		System.out.println();
	}
}
