
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("Buffer before modification : " + sb);
		System.out.println("Character at index 1 : " + sb.charAt(1));

		sb.setCharAt(1, 'i');
		sb.setLength(2);

		System.out.println("Buffer after modification : " + sb);
		System.out.println("Character at index 1 : " + sb.charAt(1));
	}
}