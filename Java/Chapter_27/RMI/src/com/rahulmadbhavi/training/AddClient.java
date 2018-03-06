
package com.rahulmadbhavi.training;

import java.rmi.*;

public class AddClient
{
	public static void main(String args[])
	{
		try
		{
			String addServerURL = "rmi://" + args[0] + "/AddServer";
			AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

			System.out.println("The first number is : " + args[1]);
			double num1 = Double.valueOf(args[1]).doubleValue();

			System.out.println("The second number is : " + args[2]);
			double num2 = Double.valueOf(args[2]).doubleValue();

			System.out.println("The sum is : " + addServerIntf.add(num1, num2));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}