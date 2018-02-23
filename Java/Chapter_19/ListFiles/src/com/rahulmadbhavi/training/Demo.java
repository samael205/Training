
package com.rahulmadbhavi.training;

import java.io.*;
import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		String dir = "resource";
		File file = new File(dir);
		
		String extensions[] = {"html", "csv", "js"};
		File files[];
		FilenameFilter filter;

		System.out.println();

		files = file.listFiles();
		System.out.println("Contents of " + dir);
		System.out.printf("%-20s %s\n", "Name", "Last Modified");
		for(File tempFile : files)
		{
			System.out.printf("%-20s %s\n", tempFile.getName(), new Date(tempFile.lastModified()));
		}
		System.out.println();

		for(String extension :  extensions)
		{
			filter = new OnlyExtension(extension);
			files = file.listFiles(filter);
			System.out.println("List of " + extension + " files of " + dir);
			System.out.printf("%-20s %s\n", "Name", "Last Modified");
			for(File tempFile : files)
			{
				System.out.printf("%-20s %s\n", tempFile.getName(), new Date(tempFile.lastModified()));
			}
			System.out.println();
		}
	}
}