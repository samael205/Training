
package com.rahulmadbhavi.training;

class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("Number of arguments : " + a);

			int b = 42 / a;
			int c[] = {1};
			c[42] = 99;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero : " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds : " + e);
		}

		System.out.println("Outside try catch block.");
	}
}