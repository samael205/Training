
package com.rahulmadbhavi.training;

import java.text.*;
import java.util.*;

public class Demo
{
	public static void main(String args[])
	{
		Date date = new Date();
		DateFormat dateFormat;

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
		System.out.println("Japan\t: " + dateFormat.format(date));

		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		System.out.println("Korea\t: " + dateFormat.format(date));

		dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		System.out.println("UK\t: " + dateFormat.format(date));

		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println("US\t: " + dateFormat.format(date));		
	}
}