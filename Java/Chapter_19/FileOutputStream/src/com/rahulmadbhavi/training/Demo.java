
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		String source = "Now is the time for all good men\n" + 
						"to come to the aid of their country\n" +
						"and pay their due taxes.";

		byte buf[] = source.getBytes();
		OutputStream fout = new FileOutputStream("file1.txt");

		for(int i=0; i<buf.length; i+=2)
		{
			fout.write(buf[i]);
		}
		fout.close();

		fout = new FileOutputStream("file2.txt");
		fout.write(buf);
		fout.close();

		fout = new FileOutputStream("file3.txt");
		fout.write(buf, buf.length - buf.length/4, buf.length/4);
		fout.close();
	}
}