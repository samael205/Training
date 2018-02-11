
package com.rahulmadbhavi.training;

import java.lang.annotation.*;
import java.lang.reflect.*;

@What(description = "An annotation test class")
@MyAnnotation(str = "Meta", val = 99)
class Meta
{
	@What(description = "Ann annotation test method")
	@MyAnnotation(str = "Testing", val = 100)
	public static void myMeth()
	{
		Meta ob = new Meta();

		try
		{
			Annotation annotations[] = ob.getClass().getAnnotations();

			// Display all annotations for Meta
			System.out.println("All annotations for Meta");
			for(Annotation annotation : annotations)
			{
				System.out.println(annotation);
			}

			System.out.println();

			Method m = ob.getClass().getMethod("myMeth");
			annotations = m.getAnnotations();

			System.out.println("All annotations for myMeth");
			for(Annotation annotation : annotations)
			{
				System.out.println(annotation);
			}
			System.out.println();
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