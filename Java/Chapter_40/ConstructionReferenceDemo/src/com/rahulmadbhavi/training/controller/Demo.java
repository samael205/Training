package com.rahulmadbhavi.training.controller;

import com.rahulmadbhavi.training.utility.MyClass;
import com.rahulmadbhavi.training.utility.MyFunction;

public class Demo
{
	public static void main(String[] args)
	{
		MyFunction myClassConstructor = MyClass::new;
		
		MyClass mc = myClassConstructor.function(100);
		
		System.out.println("Value in mc is : " + mc.getVal());
	}
}
