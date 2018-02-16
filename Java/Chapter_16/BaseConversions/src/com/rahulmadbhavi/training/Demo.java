
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		int num = 19648;

		System.out.println(num + " in base 2   : " + Integer.toBinaryString(num));
		System.out.println(num + " in base 8   : " + Integer.toOctalString(num));
		System.out.println(num + " in base 16  : " + Integer.toHexString(num));
	}
}