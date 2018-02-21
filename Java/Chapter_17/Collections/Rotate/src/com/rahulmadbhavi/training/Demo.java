
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i=0; i<10; i++)
		{
			list.add(i);
		}
	
		System.out.println();

		System.out.println("list : " + list);
		System.out.println();

		System.out.println("Collections.rotate(list, 7);");
		Collections.rotate(list, 7);

		System.out.println("list : " + list);
		System.out.println();
	}
}