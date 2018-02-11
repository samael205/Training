
package com.rahulmadbhavi.training;

import java.lang.annotation.*;
import java.lang.reflect.*;

class Meta
{
	@MyAnnotation(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i)
	{
		Meta ob = new Meta();

		try
		{
			Class c = ob.getClass();

			Method m = c.getMethod("myMeth", String.class, int.class);

			MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

			System.out.println(annotation.str() + " : " + annotation.val());
		}
		catch(NoSuchMethodException e)
		{
			System.out.println("Method not found.");
		}
	}

	public static void main(String args[])
	{
		myMeth("test", 10);
	}
}