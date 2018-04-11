package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class TrySplitDemo
{
	public static void main(String[] args)
	{
		// Create a list of strings.
		ArrayList<String> myList = new ArrayList<>();		
		myList.add("Alpha");
		myList.add("Beta");
		myList.add("Gamma");
		myList.add("Delta");
		myList.add("Phi");
		myList.add("Omega");

		// Obtain a Stream to the array list.
		Stream<String> myStream = myList.stream();
		
		// Obtain a Spliterator
		Spliterator<String> splItr = myStream.spliterator();
		
		// Now, split the first iterator.
		Spliterator<String> splItr2 = splItr.trySplit();
		
		// If SplItr could be split, use splitItr2 first.
		if(splItr2 != null)
		{
			System.out.println("Output from splItr2 : ");
			splItr2.forEachRemaining((n) -> System.out.println(n));
		}
		
		// Now use the splItr
		System.out.println("Output from splItr : ");
		splItr.forEachRemaining((n) -> System.out.println(n));
	}
}
