package com.rahulmadbhavi.training;

public class Demo
{
	public static void main(String[] args)
	{
		// Create a reference to the MyClass<T> constructor.
		MyFunction<Integer> myClassConstructor = MyClass<Integer>::new;
		
		// Create an instance of MyClass<T> via that constructor reference.
		MyClass<Integer> mc = myClassConstructor.function(100);
		
		// Use the instance of MyClass<T> just created.
		System.out.println("val in mc is " + mc.getVal());
	}
}
