
package com.rahulmadbhavi.training;

import java.io.*;
import java.util.*;

class Demo
{
	public static void main(String args[]) throws IOException
	{
		Properties ht = new Properties();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name, number;

		FileInputStream fin = null;
		boolean changed = false;

		try
		{
			fin = new FileInputStream("phonebook.dat");
		}
		catch(FileNotFoundException e)
		{
			// Ignore missing file
		}

		// If exists, load numbers
		try
		{
			if(fin != null)
			{
				ht.load(fin);
				fin.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading file.");
		}

		do
		{
			System.out.print("Enter new name ('quit' to stop) : ");

			name = br.readLine();
			
			if(name.equals("quit"))
			{
				break;
			}

			System.out.print("Enter number : ");

			number = br.readLine();

			ht.put(name, number);
			changed = true;
		
		}while(true);

		if(changed)
		{
			FileOutputStream fout = new FileOutputStream("phonebook.dat");

			ht.store(fout, "Telephone Book");
			fout.close();
		}

		do
		{
			System.out.print("Enter name to find ('quit' to quit) : ");

			name = br.readLine();

			if(name.equals("quit"))
			{
				break;
			}

			number = (String) ht.get(name);
			System.out.println("Number : " + number);
		
		}while(true);
	}
}