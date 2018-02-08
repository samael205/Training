
package com.rahulmadbhavi.training;

class VarArgs3
{
	static void vaTest(int ... v)
	{
		System.out.println("vaTest(int ... v)");
		System.out.println("#Arguments : " + v.length);
		System.out.print("Contents : ");

		for(int x : v)
		{
			System.out.print(x + " ");
		}

		System.out.println("\n");
	}

	static void vaTest(boolean ... b)
	{
		System.out.println("vaTest(boolean ... b)");
		System.out.println("#Arguments : " + b.length);
		System.out.print("Contents : ");

		for(boolean x : b)
		{
			System.out.print(x + " ");
		}

		System.out.println("\n");
	}

	static void vaTest(String msg, int ... v)
	{
		System.out.println("vaTest(String msg, int ... v)");
		System.out.println("Message : " + msg);
		System.out.println("#Arguments : " + v.length);
		System.out.print("Contents : ");

		for(int x : v)
		{
			System.out.print(x + " ");
		}

		System.out.println("\n");
	}

	static void vaTest()
	{
		System.out.println("No Arguments");
	}

	public static void main(String args[])
	{
		vaTest(1, 2, 3);
		vaTest("Testing", 10, 20);
		vaTest(true, false, false);
		vaTest();
	}
}