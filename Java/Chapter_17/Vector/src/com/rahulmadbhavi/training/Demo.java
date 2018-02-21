
package com.rahulmadbhavi.training;

import java.util.Vector;

class Demo
{
	public static void main(String args[])
	{
		Vector<Integer> vector = new Vector<Integer>();

		System.out.println();

		System.out.println("vector.addElement(1);");
		System.out.println("vector.addElement(2);");
		System.out.println("vector.addElement(3);");
		System.out.println("vector.addElement(4);");
		System.out.println("vector.addElement(5);");
		System.out.println();

		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		vector.addElement(5);

		System.out.println("vector : " + vector);
		System.out.println();

		System.out.println("vector.capacity() : " + vector.capacity());
		System.out.println();

		System.out.println("vector.contains(2) : " + vector.contains(2));
		System.out.println("vector.contains(6) : " + vector.contains(6));
		System.out.println();

		System.out.println("vector.elementAt(3) : " + vector.elementAt(3));
		System.out.println();

		System.out.println("vector.firstElement() : " + vector.firstElement());
		System.out.println();

		System.out.println("vector.lastElement() : " + vector.lastElement());
		System.out.println();

		System.out.println("vector.indexOf(4) : " + vector.indexOf(4));
		System.out.println();

		System.out.println("vector.indexOf(4, 2) : " + vector.indexOf(4, 2));
		System.out.println();

		System.out.println("vector.lastIndexOf(4) : " + vector.lastIndexOf(4));
		System.out.println();

		System.out.println("vector.lastIndexOf(4, 2) : " + vector.lastIndexOf(4, 2));
		System.out.println();

		System.out.println("vector.insertElementAt(6, 3);");
		vector.insertElementAt(6, 3);
		System.out.println("vector : " + vector);
		System.out.println();

		System.out.println("vector.isEmpty() : " + vector.isEmpty());
		System.out.println();

		System.out.println("vector.removeElement(6) : " + vector.removeElement(6));
		System.out.println("vector : " + vector);
		System.out.println();

		System.out.println("vector.removeElement(6) : " + vector.removeElement(6));
		System.out.println("vector : " + vector);
		System.out.println();

		System.out.println("vector.size() : " + vector.size());
		System.out.println();

		System.out.println("vector.setElementAt(6, 4)");
		vector.setElementAt(6, 4);
		System.out.println("vector : " + vector);
		System.out.println();

		System.out.println("vector.removeAllElements();");
		vector.removeAllElements();
		System.out.println();
	}
}