
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		String temp = "abcdefghijklmnopqrstuvwxyz";

		byte b[] = temp.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(b);

		for(int i=0; i<2; i++)
		{
			int c;

			while((c = in.read()) != -1)
			{
				if(i == 0)
				{
					System.out.print((char) c);
				}
				else
				{
					System.out.print(Character.toUpperCase((char) c));
				}
			}

			System.out.println();

			in.reset();
		}
	}
}