
package com.rahulmadbhavi.training;

import java.text.*;
import java.util.*;

public class Demo
{
	public static void main(String args[])
	{
		Date date = new Date();
		DateFormat dateFormat;

		dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
		System.out.println("Japan\t: " + dateFormat.format(date));

		dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
		System.out.println("UK\t: " + dateFormat.format(date));

		dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
		System.out.println("Canada\t: " + dateFormat.format(date));
	}
}