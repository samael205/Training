
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("This is a test.");

		System.out.println(sb.delete(4, 7));
		System.out.println(sb.deleteCharAt(0));
	}
}