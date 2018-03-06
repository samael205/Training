
package com.rahulmadbhavi.training;

import java.lang.reflect.*;

public class Demo
{
	public static void main(String args[])
	{
		try
		{
			Class classVar = Class.forName("java.awt.Dimension");

			System.out.println();
			System.out.println("Constructors");
			Constructor constructors[] = classVar.getConstructors();
			for(Constructor constructor : constructors)
			{
				System.out.println("\t" + constructor);
			}

			System.out.println();
			System.out.println("Fields");
			Field fields[] = classVar.getFields();
			for(Field field : fields)
			{
				System.out.println("\t" + field);
			}

			System.out.println();
			System.out.println("Methods");
			Method methods[] = classVar.getMethods();
			for(Method method : methods)
			{
				System.out.println("\t" + method);
			}

			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}
}