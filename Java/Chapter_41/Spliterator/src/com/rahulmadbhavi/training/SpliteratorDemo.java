package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("Alpha");
		myList.add("Beta");
		myList.add("Gamma");
		myList.add("Delta");
		myList.add("Phi");
		myList.add("Omega");
		
		// Obtain a Stream to the ArrayList
		Stream<String> myStream = myList.stream();
		
		// Obtain a SplitIterator
		Spliterator<String> splitItr = myStream.spliterator();
		
		// Iterator the elements of the stream.
		while(splitItr.tryAdvance((n) -> System.out.println(n)));
	}
}
