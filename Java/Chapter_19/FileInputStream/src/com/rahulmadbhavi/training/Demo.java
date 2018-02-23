
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		int size;
		InputStream fin = new FileInputStream("src/com/rahulmadbhavi/training/Demo.java");

		System.out.println("Total bytes : " + (size = fin.available()));

		int n = size/40;

		System.out.println("First " + n + " bytes of the file read one at a time.");
		for(int i=0; i<n; i++)
		{
			System.out.print((char) fin.read());
		}

		System.out.println("\nStill available : " + fin.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		byte b[] = new byte[n];
		if(fin.read(b) != n)
		{
			System.err.println("Couldn't read " + n + " bytes.");
		}

		System.out.println(new String(b, 0, n));
		System.out.println("\nStill available : " + (size = fin.available()));
		System.out.println("Skipping half of remaining bytes with skip()");
		fin.skip(size/2);
		
		System.out.println("Still available : " + fin.available());
		System.out.println("Reading " + (n/2) + " into the end of the array");
		if(fin.read(b, n/2, n/2) != n/2)
		{
			System.err.println("couldn't read " + n/2 + " bytes.");
		}
		System.out.println(new String(b, 0, b.length));
		System.out.println("Still Available : " + fin.available());
		fin.close();
	}
}