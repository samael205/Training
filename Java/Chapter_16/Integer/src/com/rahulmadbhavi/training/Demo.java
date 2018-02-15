
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("Integer.bitCount(14) : " + Integer.bitCount(14));
		System.out.println();

		System.out.println("new Integer(14).byteValue() : " + new Integer(14).byteValue());
		System.out.println("new Integer(14).shortValue() : " + new Integer(14).shortValue());
		System.out.println("new Integer(14).intValue() : " + new Integer(14).intValue());
		System.out.println("new Integer(14).longValue() : " + new Integer(14).longValue());
		System.out.println("new Integer(14).floatValue() : " + new Integer(14).floatValue());
		System.out.println("new Integer(14).doubleValue() : " + new Integer(14).doubleValue());
		System.out.println();

		System.out.println("new Integer(1).compareTo(new Integer(0)) : " + new Integer(1).compareTo(new Integer(0)));
		System.out.println("new Integer(1).compareTo(new Integer(1)) : " + new Integer(1).compareTo(new Integer(1)));
		System.out.println("new Integer(1).compareTo(new Integer(2)) : " + new Integer(1).compareTo(new Integer(2)));
		System.out.println();

		System.out.println("Integer.decode(\"1\") : " + Integer.decode("1"));
		System.out.println();

		System.out.println("new Integer(1).hashCode() : " + new Integer(1).hashCode());
		System.out.println();

		System.out.println("Integer.highestOneBit(14) : " + Integer.highestOneBit(14));
		System.out.println("Integer.lowestOneBit(14) : " + Integer.lowestOneBit(14));
		System.out.println("Integer.numberOfLeadingZeros(14) : " + Integer.numberOfLeadingZeros(14));
		System.out.println("Integer.numberOfTrailingZeros(14) : " + Integer.numberOfTrailingZeros(14));
		System.out.println();

		System.out.println("Integer.parseInt(\"1\") : " + Integer.parseInt("1"));
		System.out.println();

		System.out.println("Integer.reverse(14) : " + Integer.reverse(14));
		System.out.println("Integer.reverseBytes(14) : " + Integer.reverseBytes(14));
		System.out.println();

		System.out.println("Integer.signum(-10) : " + Integer.signum(-10));
		System.out.println("Integer.signum(0) : " + Integer.signum(0));
		System.out.println("Integer.signum(10) : " + Integer.signum(10));
		System.out.println();

		System.out.println("Integer.toBinaryString(14) : " + Integer.toBinaryString(14));
		System.out.println("Integer.toOctalString(14) : " + Integer.toOctalString(14));
		System.out.println("Integer.toHexString(14) : " + Integer.toHexString(14));
		System.out.println();

		System.out.println("new Integer(14).toString() : " + new Integer(14).toString());
		System.out.println();

		System.out.println("Integer.toString(14) : " + Integer.toString(14));
		System.out.println();

		System.out.println("Integer.valueOf(14) : " + Integer.valueOf(14));
		System.out.println("Integer.valueOf(\"14\") : " + Integer.valueOf("14"));
		System.out.println();
	}
}