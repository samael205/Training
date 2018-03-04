
package com.rahulmadbhavi.training;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Demo
{
	public static void main(String args[])
	{
		FileInputStream fin;
		FileOutputStream fout;

		FileChannel fileInputChannel;
		FileChannel fileOutputChannel;

		long fileSize;
		MappedByteBuffer buffer;

		if(args.length != 2)
		{
			System.out.println("Syntax : java -cp bin com.rahulmadbhavi.training.Demo <source> <destination>");
			System.exit(1);
		}

		try
		{
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			// Get channels to the input and output files.
			fileInputChannel = fin.getChannel();
			fileOutputChannel = fout.getChannel();

			// Get the size of the file.
			fileSize = fileInputChannel.size();

			// Map the input file to a buffer
			buffer = fileInputChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);

			// Write the buffer to the output file.
			fileOutputChannel.write(buffer);

			// Close the channels and files
			fileInputChannel.close();
			fileOutputChannel.close();

			fin.close();
			fout.close();			
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
}