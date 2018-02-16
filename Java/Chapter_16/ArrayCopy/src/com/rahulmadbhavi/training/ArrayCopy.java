
package com.rahulmadbhavi.training;

class ArrayCopy
{
	public static void main(String args[])
	{
		byte a[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
		byte b[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

		System.out.println("a : " + new String(a));
		System.out.println("b : " + new String(b));

		System.arraycopy(a, 0, b, 0, a.length);

		System.out.println("a : " + new String(a));
		System.out.println("b : " + new String(b));

		System.arraycopy(a, 0, a, 1, a.length - 1);
		System.arraycopy(b, 1, b, 0, b.length - 1);

		System.out.println("a : " + new String(a));
		System.out.println("b : " + new String(b));
	}
}