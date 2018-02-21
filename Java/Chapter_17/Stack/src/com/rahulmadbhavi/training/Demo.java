
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println();

		System.out.println("stack.empty() : " + stack.empty());
		System.out.println();

		System.out.println("stack.push(1) : " + stack.push(1));
		System.out.println("stack.push(2) : " + stack.push(2));
		System.out.println("stack.push(3) : " + stack.push(3));
		System.out.println("stack.push(4) : " + stack.push(4));
		System.out.println("stack.push(5) : " + stack.push(5));
		System.out.println();

		System.out.println("stack : " + stack);	
		System.out.println();

		System.out.println("stack.peek() : " + stack.peek());
		System.out.println("stack : " + stack);
		System.out.println();

		System.out.println("stack.pop() : " + stack.pop());
		System.out.println("stack : " + stack);
		System.out.println();

		System.out.println("stack.search(4) : " + stack.search(4));
		System.out.println();

		System.out.println("stack.search(5) : " + stack.search(5));
		System.out.println();
	}
}