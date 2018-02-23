
package com.rahulmadbhavi.training;

import java.io.*;

class Demo
{
	public static void main(String args[])
	{
		String dir = "resource";
		File file = new File(dir);
		
		String extensions[] = {"html", "csv", "js"};
		String contents[];
		FilenameFilter filter;

		for(String extension : extensions)
		{
			filter = new OnlyExtension(extension);
			contents = file.list(filter);
			
			System.out.println("List of " + extension + " files in " + dir + " :");

			for(String fileName : contents)
			{
				System.out.println(fileName);
			}

			System.out.println();
		}
	}
}