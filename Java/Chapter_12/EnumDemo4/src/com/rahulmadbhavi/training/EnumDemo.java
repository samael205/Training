
package com.rahulmadbhavi.training;

class EnumDemo
{
	public static void main(String args[])
	{
		Apple ap, ap2, ap3;

		System.out.println("Ordinal values");
		for(Apple apple : Apple.values())
		{
			System.out.println(apple + " : " + apple.ordinal());
		}
		System.out.println();

		ap = Apple.RedDel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.RedDel;

		if(ap.compareTo(ap2) < 0)
		{
			System.out.println(ap + " comes before " + ap2);
		}
		else if(ap.compareTo(ap2) > 0)
		{
			System.out.println(ap2 + " comes before " + ap);
		}
		else
		{
			System.out.println(ap + " equals " + ap2);
		}

		System.out.println();

		if(ap.compareTo(ap3) < 0)
		{
			System.out.println(ap + " comes before " + ap3);
		}
		else if(ap.compareTo(ap3) > 0)
		{
			System.out.println(ap3 + " comes before " + ap);
		}
		else
		{
			System.out.println(ap + " equals " + ap3);
		}

		System.out.println();
	}
}