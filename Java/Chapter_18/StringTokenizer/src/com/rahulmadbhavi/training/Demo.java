
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		String csvData = 	  "A,7,8,9\n"
							+ "B,9,9,9\n"
							+ "C,8,9,8\n";

		StringTokenizer st = new StringTokenizer(csvData, ",\n");

		String name;
		String sub1;
		String sub2;
		String sub3;

		int count = 0;

		System.out.println();

		while(st.hasMoreTokens())
		{
			count++;

			name = st.nextToken();
			sub1 = st.nextToken();
			sub2 = st.nextToken();
			sub3 = st.nextToken();

			System.out.println("After iteration " + count + ", number of tokens left : " + st.countTokens());
			System.out.println(name + " : " + (Integer.parseInt(sub1) + Integer.parseInt(sub2) + Integer.parseInt(sub3)));
		}

		System.out.println();
	}
}