
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{	
		Formatter formatter;

		System.out.println();

		// Formatting String
		System.out.println("String formatting");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("String : %s", "Test String");
		System.out.println(formatter);
		System.out.println();

		// Formattin Numbers
		System.out.println("Number formatting");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("Numbers : %d, %f", 1, 10.5);
		System.out.println(formatter);
		System.out.println();

		// Fomatting to different bases
		System.out.println("Base conversion");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("Numbers : %d, Hex : %X, Octal : %o", 254, 254, 254);
		System.out.println(formatter);
		System.out.println();

		// Formatting to fill width
		System.out.println("Padding and Allignment");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("|%f|%n|%12f|%n|%012f|%n|%12.4f|%n|%-12.4f|", 10.12345, 10.12345, 10.12345, 10.12345, 10.12345);
		System.out.println(formatter);
		System.out.println();

		// Formatting numbers
		System.out.println("Setting Widths");
		System.out.println("-------------------------------------------");
		for(int i=1; i<10; i++)
		{
			formatter = new Formatter();
			formatter.format("%4d %4d %4d", i, i*i, i*i*i);
			System.out.println(formatter);
		}
		System.out.println();

		// Formatting Floating Point numbers
		System.out.println("Float Point %g");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		for(double i=1000; i<1.0e+10; i*=100)
		{
			formatter.format("%g ", i);
			System.out.println(formatter);
		}
		System.out.println();

		System.out.println("Sign Allignment and Comma for big numbers");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("%d", 100);
		System.out.println(formatter);
		formatter = new Formatter();
		formatter.format("% d", 100);
		System.out.println(formatter);
		formatter = new Formatter();
		formatter.format("% d", -100);
		System.out.println(formatter);
		formatter = new Formatter();
		formatter.format("% (d", 100);
		System.out.println(formatter);
		formatter = new Formatter();
		formatter.format("% (d", -100);
		System.out.println(formatter);
		formatter = new Formatter();
		formatter.format("%,.2f", 123456789.23);
		System.out.println(formatter);
		System.out.println();

		// Formatting Date
		System.out.println("Argument Index");
		System.out.println("-------------------------------------------");
		formatter = new Formatter();
		formatter.format("%3$d %1$d %2$d", 10, 20, 30);
		System.out.println(formatter);
		System.out.println();

		// Formatting Date
		System.out.println("Calendar object Specifiers");
		System.out.println("-------------------------------------------");
		Calendar calendar = Calendar.getInstance();

		formatter = new Formatter();
		formatter.format("%%ta : %ta", calendar);
		System.out.println(formatter);

		formatter = new Formatter();
		formatter.format("%%tA : %tA", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tb : %tb", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tB : %tB", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tc : %tc", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tC : %tC", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%td : %td", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tD : %tD", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%te : %te", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tF : %tF", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%th : %th", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tH : %tH", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tI : %tI", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tj : %tj", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tk : %tk", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tl : %tl", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tL : %tL", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tm : %tm", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tM : %tM", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tN : %tN", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tp : %tp", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tQ : %tQ", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tr : %tr", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tR : %tR", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%ts : %ts", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tS : %tS", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tT : %tT", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%ty : %ty", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tY : %tY", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tz : %tz", calendar);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%%tZ : %tZ", calendar);
		System.out.println(formatter);
		
		System.out.println();
	}
}