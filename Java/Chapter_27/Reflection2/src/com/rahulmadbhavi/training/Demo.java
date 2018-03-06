
package com.rahulmadbhavi.training;

import java.lang.reflect.*;

public class Demo
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();

			Class classVar = a.getClass();

			System.out.println("Public methods:");
			Method methods[] = classVar.getDeclaredMethods();

			for(Method method : methods)
			{
				int modifiers = method.getModifiers();

				if(Modifier.isPublic(modifiers))
				{
					System.out.println("\t" + method.getName());
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}