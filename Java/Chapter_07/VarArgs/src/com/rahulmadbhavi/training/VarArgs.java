
package com.rahulmadbhavi.training;

class VarArgs
{
	static void vaTest(int ... v)
	{
		System.out.println("Number of arguments : " + v.length);

		System.out.print("Contents : ");

		for(int x : v)
		{
			System.out.print(x + " ");
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}