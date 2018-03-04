
package com.rahulmadbhavi.training;

// Use NIO to read a text file.
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
		ByteBuffer buffer;

		try
		{
			// First open a file for input.
			fin = new FileInputStream("Content.txt");

			// Next obtain a channel to that file.
			fileChannel = fin.getChannel();

			// Now, get the file's size
			fileSize = fileChannel.size();

			// Allocate a buffer of necessary size
			buffer = ByteBuffer.allocate((int) fileSize);

			// Read the file into the buffer.
			fileChannel.read(buffer);

			// Rewind the buffer so that it can be read.
			buffer.rewind();

			// Read bytes from the buffer.
			for(int i=0; i<fileSize; i++)
			{
				System.out.print((char) buffer.get());
			}

			System.out.println();

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