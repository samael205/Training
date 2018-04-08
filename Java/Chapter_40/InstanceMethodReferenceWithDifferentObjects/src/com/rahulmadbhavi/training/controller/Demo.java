
package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.utility.HighTemperature;
import com.rahulmadbhavi.training.utility.MyFunction;

public class Demo
{
	static <T> int counter(T[] vals, MyFunction<T> f, T v)
	{
		int count = 0;

		for (int index = 0; index < vals.length; index++ )
		{
			if (f.function(vals[index], v))
			{
				count++ ;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		int count;

		HighTemperature[] weekDayHighs = { new HighTemperature(89), new HighTemperature(82), new HighTemperature(90), new HighTemperature(89), new HighTemperature(89), new HighTemperature(91), new HighTemperature(84), new HighTemperature(83) };		
		count = counter(weekDayHighs, HighTemperature::sameTemperature, new HighTemperature(89));		
		System.out.println(count + " days had a high-temperature of 89.");

		HighTemperature[] weekDayHighs2 = { new HighTemperature(32), new HighTemperature(12), new HighTemperature(24), new HighTemperature(19), new HighTemperature(18), new HighTemperature(12), new HighTemperature(-1), new HighTemperature(13) };		
		count = counter(weekDayHighs2, HighTemperature::sameTemperature, new HighTemperature(12));		
		System.out.println(count + " days had a high-temperature of 12.");

		count = counter(weekDayHighs, HighTemperature::lessThanTemperature, new HighTemperature(89));		
		System.out.println(count + " days had a high-temperature less than 89.");

		count = counter(weekDayHighs2, HighTemperature::lessThanTemperature, new HighTemperature(19));		
		System.out.println(count + " days had a high-temperature less than 19.");
	}
}
