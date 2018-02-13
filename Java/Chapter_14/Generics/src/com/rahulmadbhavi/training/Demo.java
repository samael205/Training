
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		Gen<Integer> ob;

		ob = new Gen<Integer>(88);

		ob.showType();

		int v = ob.getOb();
		System.out.println("value : " + v);

		System.out.println();

		Gen<String> strOb = new Gen<String>("Generics test.");

		strOb.showType();

		String str = strOb.getOb();
		System.out.println("value : " + str);
	}
}