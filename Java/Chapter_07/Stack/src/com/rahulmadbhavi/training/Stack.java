
package com.rahulmadbhavi.training;

class Stack
{
	private int stack[];
	private int tos;

	Stack(int size)
	{
		stack = new int[size];
		tos = -1;
	}

	void push(int num)
	{
		if(tos == stack.length - 1)
		{
			System.out.println("Stack is full!");
		}
		else
		{
			stack[++tos] = num;
		}
	}

	int pop()
	{
		if(tos == -1)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
		{
			return stack[tos--];
		}
	}
}