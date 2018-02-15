
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("new Byte((byte) 1).byteValue() : " + new Byte((byte) 1).byteValue());
		System.out.println();

		System.out.println("Byte.decode(\"123\") : " + Byte.decode("123"));
		System.out.println();

		System.out.println("new Byte((byte) 1 ).doubleValue() : " + new Byte((byte) 1 ).doubleValue());
		System.out.println("new Byte((byte) 1 ).floatValue() : " + new Byte((byte) 1 ).floatValue());
		System.out.println("new Byte((byte) 1 ).intValue() : " + new Byte((byte) 1 ).intValue());
		System.out.println("new Byte((byte) 1 ).longValue() : " + new Byte((byte) 1 ).longValue());
		System.out.println("new Byte((byte) 1 ).shortValue() : " + new Byte((byte) 1 ).shortValue());
		System.out.println();

		System.out.println("new Byte((byte) 1).equals(new Byte((byte) 1)) : " + new Byte((byte) 1).equals(new Byte((byte) 1)));
		System.out.println("new Byte((byte) 1).equals(new Byte((byte) 2)) : " + new Byte((byte) 1).equals(new Byte((byte) 2)));
		System.out.println();

		System.out.println("new Byte((byte) 1).hashCode() : " + new Byte((byte) 1).hashCode());
		System.out.println();

		System.out.println("Byte.parseByte(\"1\") : " + Byte.parseByte("1"));
		System.out.println();

		System.out.println("new Byte((byte) 1).toString() : " + new Byte((byte) 1).toString());
		System.out.println();

		System.out.println("Byte.toString((byte) 1) : " + Byte.toString((byte) 1));
		System.out.println();

		System.out.println("Byte.valueOf((byte) 1) : " + Byte.valueOf((byte) 1));
		System.out.println("Byte.valueOf(\"1\") : " + Byte.valueOf("1"));

		System.out.println();
	}
}