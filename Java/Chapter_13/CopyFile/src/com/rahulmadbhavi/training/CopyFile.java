
package com.rahulmadbhavi.training;

import java.io.*;

class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try
		{
			try
			{
				fin = new FileInputStream(args[0]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Input file not found.");
				return;
			}

			try
			{
				fout = new FileOutputStream(args[1]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Error opening output file.");
				return;
			}

			try
			{
				do
				{
					i = fin.read();

					if(i != -1)
					{
						fout.write(i);
					}
					else
					{
						break;
					}

				}while(true);
			}
			catch(IOException e)
			{
				System.out.println("File Error");
			}

			fin.close();
			fout.close();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Syntax: CopyFile <source> <destination>");
			return;
		}
	}
}