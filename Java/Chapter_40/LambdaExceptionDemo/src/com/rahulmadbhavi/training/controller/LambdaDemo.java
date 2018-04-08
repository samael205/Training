
package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.exceptions.ArrayEmptyException;
import com.rahulmadbhavi.training.exceptions.ArrayNullException;
import com.rahulmadbhavi.training.utility.NumericArray;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		Integer[] intArray = null;

		NumericArray<Integer> integerAverage = (Integer[] array) ->
		{
			double average = 0.0;

			if (array == null)
			{
				throw new ArrayNullException();
			}
			else if (array.length == 0)
			{
				throw new ArrayEmptyException();
			}
			else
			{
				for (int val : array)
				{
					average += val;
				}

				average /= array.length;
			}

			return average;
		};

		try
		{
			System.out.println("Attempting to find average of null array.");
			System.out.println("Average of null array : " + integerAverage.average(intArray));
		}
		catch (ArrayNullException e)
		{
			System.out.println("Null Array Exception caught : " + e);
		}
		catch (ArrayEmptyException e)
		{
			System.out.println("Empty Array Exception caught : " + e);
		}

		intArray = new Integer[] {};
		try
		{
			System.out.println("Attempting to find average of empty array.");
			System.out.println("Average of empty array : " + integerAverage.average(intArray));
		}
		catch (ArrayNullException e)
		{
			System.out.println("Null Array Exception caught : " + e);
		}
		catch (ArrayEmptyException e)
		{
			System.out.println("Empty Array Exception caught : " + e);
		}

		intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try
		{
			System.out.println("Attempting to find average of array.");
			System.out.println("Average of array : " + integerAverage.average(intArray));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
