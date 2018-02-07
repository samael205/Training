
package com.rahulmadbhavi.training;

class Stack
{
	int stack[];
	int tos;

	Stack()
	{
		stack = new int[10];
		tos = -1;
	}

	void push(int item)
	{
		if(tos == stack.length - 1)
		{
			System.out.println("Stack full!");
		}
		else
		{
			stack[++tos] = item;
		}
	}

	int pop()
	{
		if(tos == -1)
		{
			System.out.println("Stack empty!");
			return 0;
		}
		else
		{
			return stack[tos--];
		}
	}
}