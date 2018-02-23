
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[])
	{
		String dirName = "resource";

		File file = new File(dirName);

		if(file.isDirectory())
		{
			File tempFile;

			System.out.println("Directory : " + dirName);

			String contents[] = file.list();

			for(int i=0; i<contents.length; i++)
			{
				tempFile = new File(dirName + "/" + contents[i]);

				if(tempFile.isDirectory())
				{
					System.out.println(contents[i] + " is a directory.");
				}
				else
				{
					System.out.println(contents[i] + " is a file.");
				}
			}
		}
		else
		{
			System.out.println(dirName + " is not a directory.");
		}
	}
}