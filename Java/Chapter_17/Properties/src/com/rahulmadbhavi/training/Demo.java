
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Properties capitals = new Properties();

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		Set states = capitals.keySet();

		for(Object name : states)
		{
			System.out.println("The capital of " + name + " is " + capitals.getProperty((String) name) + ".");
		}

		System.out.println();

		String str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + str + ".");
		System.out.println();
	}
}