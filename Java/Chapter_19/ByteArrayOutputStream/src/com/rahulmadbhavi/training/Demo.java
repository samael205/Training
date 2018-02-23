
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		ByteArrayOutputStream fout = new ByteArrayOutputStream();
		String string = "This should end up in the array";
		byte buffer[] = string.getBytes();

		fout.write(buffer);
		System.out.println("Buffer as a string");
		System.out.println(fout.toString());
		System.out.println("Into array");

		byte b[] = fout.toByteArray();

		for(int i=0; i<b.length; i++)
		{
			System.out.print((char) b[i]);
		}
		System.out.println("\nTo an OutputStream()");
		OutputStream fout2 = new FileOutputStream("test.txt");

		fout.writeTo(fout2);
		fout2.close();
		System.out.println("Doing a reset");
		fout.close();
		for(int i=0; i<3; i++)
		{
			fout.write('X');
		}
		System.out.println(fout.toString());
	}
}