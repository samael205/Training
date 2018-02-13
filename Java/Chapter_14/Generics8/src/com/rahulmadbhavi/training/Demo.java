
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Integer inums[] = {3, 6, 2, 8, 6};
		Character chs[] = {'b', 'r', 'p', 'w'};

		MyClass<Integer> iOb = new MyClass<Integer>(inums);
		MyClass<Character> cOb = new MyClass<Character>(chs);

		System.out.println("inums");
		System.out.println("min : " + iOb.min());
		System.out.println("max : " + iOb.max());
		System.out.println();

		System.out.println("chs");
		System.out.println("min : " + cOb.min());
		System.out.println("max : " + cOb.max());
		System.out.println();
	}
}