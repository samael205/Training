package com.rahulmadbhavi.training.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.rahulmadbhavi.training.utility.MyClass;

public class Demo
{
	static int compareFunction(MyClass myClass1, MyClass myClass2)
	{
		return (myClass1.getVal() - myClass2.getVal());
	}
	
	public static void main(String[] args)
	{
		ArrayList<MyClass> list = new ArrayList<MyClass>();
		
		list.add(new MyClass(1));
		list.add(new MyClass(4));
		list.add(new MyClass(2));
		list.add(new MyClass(9));
		list.add(new MyClass(3));
		list.add(new MyClass(7));
		
		// Find the maximum value in list using the compareFunction method
		MyClass maxValueObject = Collections.max(list, Demo::compareFunction);
		
		System.out.println("Maximum value is : " + maxValueObject.getVal());
	}
}
