
package com.rahulmadbhavi.training;

import java.lang.annotation.*;
import java.lang.reflect.*;

class Meta
{
	@MyAnnotation()
	public static void myMeth()
	{
		Meta ob = new Meta();

		try
		{
			Class c = ob.getClass();

			Method m = c.getMethod("myMeth");

			MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

			System.out.println(annotation.str() + " " + annotation.val());
		}
		catch(NoSuchMethodException e)
		{
			System.out.println("Method not found.");
		}
	}

	public static void main(String args[])
	{
		myMeth();
	}
}