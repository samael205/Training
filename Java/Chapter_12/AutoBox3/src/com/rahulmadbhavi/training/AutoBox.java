
package com.rahulmadbhavi.training;

class AutoBox
{
	public static void main(String args[])
	{
		Integer integer, integer2;
		int i;

		integer = 100;
		System.out.println("Original value of integer : " + integer);

		++integer;
		System.out.println("Value of integer after ++integer : " + integer);

		integer2 = integer + (integer / 3);
		System.out.println("integer2 after expression : " + integer2);

		i = integer + (integer / 3);
		System.out.println("i after expression : " + i);
	}
}