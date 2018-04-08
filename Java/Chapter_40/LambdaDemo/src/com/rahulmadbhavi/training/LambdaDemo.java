package com.rahulmadbhavi.training;

public class LambdaDemo
{
	public static void main(String args[])
	{
		MyNumber myNum;
		
		myNum = () -> 123.45;
		System.out.println("Using fixed value : " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		System.out.println("A random value between 0 and 100 : " + myNum.getValue());
		System.out.println("Another random value between 0 and 100 : " + myNum.getValue());
	}
}
