
package com.rahulmadbhavi.training;

import java.awt.*;
import java.beans.*;

public class IntrospectorDemo
{
	public static void main(String args[])
	{
		try
		{
			Class classVar = Class.forName("com.rahulmadbhavi.training.Colors");
			BeanInfo beanInfo = Introspector.getBeanInfo(classVar);

			System.out.println("Properties : ");
			PropertyDescriptor propertyDescriptors[] = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor propertyDescriptor : propertyDescriptors)
			{
				System.out.println("\t" + propertyDescriptor.getName());
			}

			System.out.println("Events : ");
			EventSetDescriptor eventSetDescriptors[] = beanInfo.getEventSetDescriptors();
			for(EventSetDescriptor eventSetDescriptor : eventSetDescriptors)
			{
				System.out.println("\t" + eventSetDescriptor.getName());
			}			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught : " + e);
		}
	}
}