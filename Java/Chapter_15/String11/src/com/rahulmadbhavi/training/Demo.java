
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		String s1 = "one";
		String s2 = s1.concat("two");

		System.out.println("Concatenation result of \"one\" and \"two\" : " + s2);

		String s3 = "hello".replace('l', 'w');
		System.out.println("'l' of \"Hello\" replaced with 'w' : " + s3);
	}
}