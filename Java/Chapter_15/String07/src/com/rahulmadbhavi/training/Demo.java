
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		String string = "Sample text";

		System.out.println("string : " + string);
		System.out.println("string.startsWith(\"Sam\") : " + string.startsWith("Sam"));
		System.out.println("string.startsWith(\"Same\") : " + string.startsWith("Same"));
		System.out.println("string.endsWith(\"ext\") : " + string.endsWith("ext"));
		System.out.println("string.endsWith(\"next\") : " + string.endsWith("next"));

		String str1 = "Sample";
		String str2 = new String(str1);

		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + (str1 == str2));
	}
}