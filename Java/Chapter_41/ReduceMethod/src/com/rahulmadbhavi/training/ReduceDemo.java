package com.rahulmadbhavi.training;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
	
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		// Two ways to obtain the integer product of the elements
		// in myList by use of reduce().
		
		Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
		if(productObj.isPresent())
		{
			System.out.println("Product as optional : " + productObj.get());
		}
		
		int product = myList.stream().reduce(1,  (a, b) -> a * b);
		System.out.println("Product as integer : " + product);
	}
}
