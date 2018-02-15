
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		String string = "Hello from the other side " + 
						"I must've called a thousand times " +
						"To tell you I'm sorry " +
						"For everything that I've done " +
						"But when I call you never " +
						"Seem to be home.";

		System.out.println();
		System.out.println(string);
		System.out.println();

		System.out.println("Index of first 'I' : " + string.indexOf('I'));
		System.out.println("Index of second 'I' : " + string.indexOf('I', string.indexOf('I') + 1));
		System.out.println("Index of last 'I' : " + string.lastIndexOf('I'));
	}
}