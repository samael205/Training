
package com.rahulmadbhavi.training;

class AutoBox
{
	static int unbox(Integer integer)
	{
		return integer;
	}

	public static void main(String args[])
	{
		Integer integer = unbox(100);

		System.out.println(integer);
	}
}