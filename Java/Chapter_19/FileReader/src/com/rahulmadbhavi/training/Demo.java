
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("src/com/rahulmadbhavi/training/Demo.java");
		BufferedReader br = new BufferedReader(fr);

		String string;

		while((string = br.readLine()) != null)
		{
			System.out.println(string);
		}

		fr.close();
	}
}