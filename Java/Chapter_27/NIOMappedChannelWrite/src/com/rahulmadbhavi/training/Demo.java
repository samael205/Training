
package com.rahulmadbhavi.training;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Demo
{
	public static void main(String args[])
	{
		RandomAccessFile fout;
		FileChannel fileChannel;
		ByteBuffer buffer;

		try
		{
			fout = new RandomAccessFile("Output.txt", "rw");

			// Next, obtain a channel to that file.
			fileChannel = fout.getChannel();

			// Then, map the file into a buffer.
			buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

			// Write some bytes to the buffer.
			for(int i=0; i<26; i++)
			{
				buffer.put((byte) ('A' + i));
			}

			// Close the channel and file.
			fileChannel.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
}