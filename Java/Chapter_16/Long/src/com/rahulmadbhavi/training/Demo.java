
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("Long.MIN_VALUE : " + Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE : " + Long.MAX_VALUE);
		System.out.println("Long.SIZE : " + Long.SIZE);
		System.out.println("Long.TYPE : " + Long.TYPE);
		System.out.println();

		System.out.println("new Long(1L).byteValue() : " + new Long(1L).byteValue());
		System.out.println("new Long(1L).shortValue() : " + new Long(1L).shortValue());
		System.out.println("new Long(1L).intValue() : " + new Long(1L).intValue());
		System.out.println("new Long(1L).longValue() : " + new Long(1L).longValue());
		System.out.println("new Long(1L).floatValue() : " + new Long(1L).floatValue());
		System.out.println("new Long(1L).doubleValue() : " + new Long(1L).doubleValue());
		System.out.println();

		System.out.println("new Long(1L).compareTo(new Long(0L) : " + new Long(1L).compareTo(new Long(0L)));		
		System.out.println("new Long(1L).compareTo(new Long(1L) : " + new Long(1L).compareTo(new Long(1L)));		
		System.out.println("new Long(1L).compareTo(new Long(2L) : " + new Long(1L).compareTo(new Long(2L)));		
		System.out.println();

		System.out.println("new Long(1L).equals(new Long(0L)) : " + new Long(1L).equals(new Long(0L)));
		System.out.println("new Long(1L).equals(new Long(1L)) : " + new Long(1L).equals(new Long(1L)));
		System.out.println("new Long(1L).equals(new Long(2L)) : " + new Long(1L).equals(new Long(2L)));
		System.out.println();

		System.out.println("new Long(1L).hashCode() : " + new Long(1L).hashCode());
		System.out.println();

		System.out.println("Long.highestOneBit(14L) : " + Long.highestOneBit(14L));
		System.out.println("Long.lowestOneBit(14L) : " + Long.lowestOneBit(14L));
		System.out.println("Long.numberOfLeadingZeros(14L) : " + Long.numberOfLeadingZeros(14L));
		System.out.println("Long.numberOfTrailingZeros(14L) : " + Long.numberOfTrailingZeros(14L));
		System.out.println();

		System.out.println("Long.parseLong(\"14\") : " + Long.parseLong("14"));
		System.out.println();

		System.out.println("Long.reverse(1L) : " + Long.reverse(1L));
		System.out.println("Long.reverseBytes(1L) : " + Long.reverseBytes(1L));
		System.out.println();

		System.out.println("Long.signum(-10L) : " + Long.signum(-10L));
		System.out.println("Long.signum(0L) : " + Long.signum(0L));
		System.out.println("Long.signum(10L) : " + Long.signum(10L));
		System.out.println();

		System.out.println("Long.toBinaryString(14) : " + Long.toBinaryString(14));
		System.out.println("Long.toOctalString(14) : " + Long.toOctalString(14));
		System.out.println("Long.toHexString(14) : " + Long.toHexString(14));
		System.out.println();

		System.out.println("new Long(14L).toString() : " + new Long(14L).toString());
		System.out.println();

		System.out.println("Long.toString(14L) : " + Long.toString(14L));
		System.out.println();

		System.out.println("Long.valueOf(14L) : " + Long.valueOf(14L));
		System.out.println();

		System.out.println("Long.valueOf(\"14\") : " + Long.valueOf("14"));
		System.out.println();
	}
}