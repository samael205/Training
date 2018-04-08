package com.rahulmadbhavi.training;

public class MyClass<T>
{
	private T val;
	
	MyClass(T val)
	{
		this.val = val;
	}
	
	MyClass()
	{
		this.val = null;
	}
	
	T getVal()
	{
		return val;
	}
}
