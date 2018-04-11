package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MapDemo
{
	public static void main(String[] args)
	{
		ArrayList<Double> myList = new ArrayList<>();
		
		myList.add(2.0);
		myList.add(4.0);
		myList.add(8.0);
		
		// Map the square roots of the elements in myList to a new stream.
		Stream<Double> sqrtRootStream = myList.stream().map((a) -> Math.sqrt(a));
		
		// Find the product of the square roots.
		double productOfSquareRoots = sqrtRootStream.reduce(1.0, (a, b) -> a * b);
		
		System.out.println("Product of square roots : " + productOfSquareRoots);
	}
}
