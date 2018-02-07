
package com.rahulmadbhavi.training;

class TestStack
{
	public static void main(String args[])
	{
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();

		// Pushing some numbers onto the stack
		for(int i=0; i<=10; i++)
		{
			myStack1.push(i);
		}

		for(int i=10; i<=20; i++)
		{
			myStack2.push(i);
		}
		
		// Pop elements from stack
		System.out.println("Items of stack 1");
		for(int i=0; i<=10; i++)
		{
			System.out.println(myStack1.pop());
		}

		System.out.println();

		System.out.println("Items of stack 2");
		for(int i=0; i<=10; i++)
		{
			System.out.println(myStack2.pop());
		}

	}
}