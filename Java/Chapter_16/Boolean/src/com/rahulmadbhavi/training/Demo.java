
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("new Boolean(true).booleanValue() : " + new Boolean(true).booleanValue());
		System.out.println("new Boolean(false).booleanValue() : " + new Boolean(false).booleanValue());
		System.out.println();

		System.out.println("new Boolean(false).compareTo(new Boolean(false)) : " + new Boolean(false).compareTo(new Boolean(false)));
		System.out.println("new Boolean(false).compareTo(new Boolean(true)) : " + new Boolean(false).compareTo(new Boolean(true)));
		System.out.println("new Boolean(true).compareTo(new Boolean(false)) : " + new Boolean(true).compareTo(new Boolean(false)));
		System.out.println("new Boolean(true).compareTo(new Boolean(true)) : " + new Boolean(true).compareTo(new Boolean(true)));
		System.out.println();

		System.out.println("new Boolean(false).equals(new Boolean(false)) : " + new Boolean(false).equals(new Boolean(false)));
		System.out.println("new Boolean(false).equals(new Boolean(true)) : " + new Boolean(false).equals(new Boolean(true)));
		System.out.println("new Boolean(true).equals(new Boolean(false)) : " + new Boolean(true).equals(new Boolean(false)));
		System.out.println("new Boolean(true).equals(new Boolean(true)) : " + new Boolean(true).equals(new Boolean(true)));
		System.out.println();

		System.out.println("new Boolean(true).hashCode() : " + new Boolean(true).hashCode());
		System.out.println();

		System.out.println("new Boolean(true).toString() : " + new Boolean(true).toString());
		System.out.println("new Boolean(false).toString() : " + new Boolean(false).toString());
		System.out.println();

		System.out.println("Boolean.toString(new Boolean(true)) : " + Boolean.toString(new Boolean(true)));
		System.out.println("Boolean.toString(new Boolean(false)) : " + Boolean.toString(new Boolean(false)));
		System.out.println();

		System.out.println("Boolean.valueOf(true) : " + Boolean.valueOf(true));
		System.out.println("Boolean.valueOf(false) : " + Boolean.valueOf(false));
		System.out.println();

		
		System.out.println("Boolean.valueOf(\"true\") : " + Boolean.valueOf("true"));
		System.out.println("Boolean.valueOf(\"false\") : " + Boolean.valueOf("false"));
		System.out.println();
	}
}