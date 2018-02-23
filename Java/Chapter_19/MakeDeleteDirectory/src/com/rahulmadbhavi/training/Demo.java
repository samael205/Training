
package com.rahulmadbhavi.training;

import java.io.*;
import java.util.*;

class Demo
{
	public static void listDirectory(File file)
	{
		System.out.println("Contents of " + file.getAbsolutePath());
		System.out.printf("%-20s %s\n", "Name", "Last Modified");

		File files[] = file.listFiles();

		if(files != null)
		{
			for(File tempFile : files)
			{
				System.out.printf("%-20s %s\n", tempFile.getName(), new Date(tempFile.lastModified()));
			}
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		File file = new File(".");
		File libFile = new File("lib");
		File tempFile;
		boolean status;

		System.out.println();

		System.out.println("Original Directory Structure : ");
		listDirectory(file);

		System.out.println("Creating a Single Folder.");
		tempFile = new File("resource");
		status = tempFile.mkdir();
		System.out.println("Operation status : " + status);
		listDirectory(file);

		System.out.println("Creating Nested Folders.");
		tempFile = new File("lib/jars");
		status = tempFile.mkdirs();
		System.out.println("Operation status : " + status);
		listDirectory(libFile);

		System.out.println("Deleting lib/jars folder.");
		tempFile = new File("lib/jars");
		status = tempFile.delete();
		System.out.println("Operation status : " + status);
		listDirectory(file);

		System.out.println("Deleting lib folder.");
		tempFile = new File("lib");
		status = tempFile.delete();
		System.out.println("Operation status : " + status);
		listDirectory(file);

		System.out.println("Deleting resource folder.");
		tempFile = new File("resource");
		status = tempFile.delete();
		System.out.println("Operation status : " + status);
		listDirectory(file);
	}
}