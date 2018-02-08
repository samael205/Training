
package com.rahulmadbhavi.training;

class VarArgs2
{
	static void vaTest(String msg, int ... v)
	{
		System.out.println("Message : " + msg);
		System.out.println("Length	: " + v.length);
		System.out.print("Contents : ");

		for(int x : v)
		{
			System.out.print(x + " ");
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		vaTest("One Argument", 10);		
		vaTest("Three Arguments", 1, 2, 3);
		vaTest("No Arguments");
	}
}