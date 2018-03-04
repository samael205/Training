
package com.rahulmadbhavi.training;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Demo
{
	public static void main(String args[])
	{
		FileOutputStream fout;
		FileChannel fileChannel;
		ByteBuffer buffer;

		try
		{
			fout = new FileOutputStream("Output.txt");

			// Get a channel to the output file.
			fileChannel = fout.getChannel();

			// Create a buffer.
			buffer = ByteBuffer.allocateDirect(26);

			// Write some bytes to the buffer.
			for(int i=0; i<26; i++)
			{
				buffer.put((byte) ('A' + i));
			}

			// Rewind the buffer so that it can be written.
			buffer.rewind();

			// Write the buffer to the output file.
			fileChannel.write(buffer);

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