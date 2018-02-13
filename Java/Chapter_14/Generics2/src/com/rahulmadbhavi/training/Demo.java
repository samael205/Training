
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Gen<Integer, String> obj = new Gen<Integer, String>(88, "Generics");

		obj.showTypes();

		int v = obj.getOb1();
		System.out.println("Value : " + v);

		String str = obj.getOb2();
		System.out.println("Value : " + v);
	}
}