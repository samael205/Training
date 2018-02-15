
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("Short.MAX_VALUE : " + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE : " + Short.MIN_VALUE);
		System.out.println("Short.SIZE : " + Short.SIZE);
		System.out.println("Short.TYPE : " + Short.TYPE);
		System.out.println();

		System.out.println("new Short((short) 1).byteValue() : " + new Short((short) 1).byteValue());
		System.out.println("new Short((short) 1).doubleValue() : " + new Short((short) 1).doubleValue());
		System.out.println("new Short((short) 1).floatValue() : " + new Short((short) 1).floatValue());
		System.out.println("new Short((short) 1).intValue() : " + new Short((short) 1).intValue());
		System.out.println("new Short((short) 1).longValue() : " + new Short((short) 1).longValue());
		System.out.println("new Short((short) 1).shortValue() : " + new Short((short) 1).shortValue());
		System.out.println();

		System.out.println("new Short((short) 1).compareTo(new Short((short) 0)) : " + new Short((short) 1).compareTo(new Short((short) 0)));
		System.out.println("new Short((short) 1).compareTo(new Short((short) 1)) : " + new Short((short) 1).compareTo(new Short((short) 1)));
		System.out.println("new Short((short) 1).compareTo(new Short((short) 2)) : " + new Short((short) 1).compareTo(new Short((short) 2)));
		System.out.println();

		System.out.println("Short.decode(\"1\") : " + Short.decode("1"));
		System.out.println();

		System.out.println("new Short((short) 1).hashCode() : " + new Short((short) 1).hashCode());
		System.out.println();

		System.out.println("new Short((short) 1).equals(new Short((byte) 0)) : " + new Short((short) 1).equals(new Short((byte) 0)));
		System.out.println("new Short((short) 1).equals(new Short((byte) 1)) : " + new Short((short) 1).equals(new Short((byte) 1)));
		System.out.println("new Short((short) 1).equals(new Short((byte) 2)) : " + new Short((short) 1).equals(new Short((byte) 2)));
		System.out.println();

		System.out.println("Short.parseShort(\"1\") : " + Short.parseShort("1"));
		System.out.println();

		System.out.println("Short.reverseBytes((short) 7) : " + Short.reverseBytes((short) 7));
		System.out.println();

		System.out.println("new Short((short) 1).toString() : " + new Short((short) 1).toString());
		System.out.println();

		System.out.println("Short.toString((short) 1) : " + Short.toString((short) 1));
		System.out.println();

		System.out.println("Short.valueOf((short) 1) : " + Short.valueOf((short) 1));
		System.out.println();

		System.out.println("Short.valueOf(\"1\") : " + Short.valueOf("1"));
		System.out.println();

		System.out.println();
	}
}