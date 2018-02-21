
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Date now = new Date();
		Date before = new Date();
		Date after = new Date();

		before.setTime(now.getTime() - 5000);
		after.setTime(now.getTime() + 5000);

		System.out.println();

		System.out.println("Now : " + now);
		System.out.println("-5s : " + before);
		System.out.println("+5s : " + after);

		System.out.println();

		System.out.println("now.compareTo(after)  : " + now.compareTo(after));
		System.out.println("now.compareTo(now)    : " + now.compareTo(now));
		System.out.println("now.compareTo(before) : " + now.compareTo(before));
		System.out.println();
	}
}