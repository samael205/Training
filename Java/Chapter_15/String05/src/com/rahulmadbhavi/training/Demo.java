
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		String string = "Sample string";

		System.out.println("String : " + string);

		System.out.println("Character at index 2 : " + string.charAt(2));

		int start = 1;
		int end = 4;
		char buffer[] = new char[end - start];
		string.getChars(start, end, buffer, 0);
		System.out.println("Substring : " + (new String(buffer)));

		char chars[] = string.toCharArray();
		System.out.print("Chars : {");
		for(int i=0; i<chars.length - 1; i++)
		{
			System.out.print("\'" + chars[i] + "\', ");
		}
		System.out.print("\'" + chars[chars.length - 1] + "\'}");
		System.out.println();
	}
}