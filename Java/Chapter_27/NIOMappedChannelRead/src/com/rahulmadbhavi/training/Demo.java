
package com.rahulmadbhavi.training;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Demo
{
	public static void main(String args[])
	{
		FileInputStream fin;
		FileChannel fileChannel;
		long fileSize;
		MappedByteBuffer buffer;

		try
		{
			// First, open a file for input.
			fin = new FileInputStream("Content.txt");

			// Next, obtain a channel to that file.
			fileChannel = fin.getChannel();

			// Get the size of the file.
			fileSize = fileChannel.size();

			// Now, map the file into a buffer
			buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);

			// Read bytes from the buffer.
			for(int i=0; i<fileSize; i++)
			{
				System.out.print((char) buffer.get());
			}

			fileChannel.close();
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
}