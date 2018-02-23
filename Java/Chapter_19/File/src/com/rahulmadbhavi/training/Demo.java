
package com.rahulmadbhavi.training;

import java.io.*;
import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		File file = new File("resource/COPYRIGHT");

		System.out.println();

		System.out.println("File Name     : " + file.getName());
		System.out.println("File Path     : " + file.getPath());
		System.out.println("Absolute Path : " + file.getAbsolutePath());
		System.out.println("Parent        : " + file.getParent());
		System.out.println("Exists?       : " + (file.exists() ? "Yes" : "No"));
		System.out.println("Writable?     : " + (file.canWrite() ? "Yes" : "No"));
		System.out.println("Readable?     : " + (file.canRead() ? "Yes" : "No"));
		System.out.println("Is directory? : " + (file.isDirectory() ? "Yes" : "No"));
		System.out.println("Is file?      : " + (file.isFile() ? "Yes" : "No"));
		System.out.println("Is absolute?  : " + (file.isAbsolute() ? "Yes" : "No"));
		System.out.println("Last Modified : " + new Date(file.lastModified()));
		System.out.println("Size          : " + file.length() + " Bytes");

		System.out.println();
	}
}