
package com.rahulmadbhavi.training;

class SortStringArray
{
	public static void main(String args[])
	{
		String array[] = {"Hello", "from", "the", "other", "side", "I", "must", "have", "called", "a", "thousand", "times"};

		System.out.println("Unsorted array");
		for(String string : array)
		{
			System.out.println(string);
		}
		System.out.println();

		for(int i=0; i<array.length - 1; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i].compareTo(array[j]) > 0)
				{
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Sorted array");
		for(String string : array)
		{
			System.out.println(string);
		}
		System.out.println();
	}
}