
package com.rahulmadbhavi.training;

class TestStack
{
	public static void main(String args[])
	{
		Stack myStack1 = new Stack(5);
		Stack myStack2 = new Stack(8);

		for(int i=0; i<5; i++)
		{
			myStack1.push(i);
		}

		for(int i=0; i<8; i++)
		{
			myStack2.push(i);
		}

		// Pop all elements of both stacks
		System.out.println("Stack 1");
		for(int i=0; i<5; i++)
		{
			System.out.println(myStack1.pop());
		}

		System.out.println();

		System.out.println("Stack 2");
		for(int i=0; i<8; i++)
		{
			System.out.println(myStack2.pop());
		}		
	}
}