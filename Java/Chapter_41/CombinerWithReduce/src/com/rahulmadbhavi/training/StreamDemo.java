package com.rahulmadbhavi.training;

import java.util.ArrayList;

public class StreamDemo
{
	public static void main(String[] args)
	{
		ArrayList<Double> myList = new ArrayList<>();
		
		myList.add(2.0);
		myList.add(4.0);
		myList.add(8.0);

		double productOfSquareRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
		
		System.out.println("Product of square roots : " + productOfSquareRoots);
	}
}
