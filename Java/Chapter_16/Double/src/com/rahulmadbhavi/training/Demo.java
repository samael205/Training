
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String arg[])
	{
		Double d1 = new Double(3.14159);
		Double d2 = new Double(314159E-5);

		System.out.println("d1.equals(d2) : " + d1.equals(d2));
		System.out.println();

		Double d3 = new Double(1/0.);
		Double d4 = new Double(0/0.);
		System.out.println(d3 + " : " + d3.isInfinite() + ", " + d3.isNaN());
		System.out.println(d4 + " : " + d4.isInfinite() + ", " + d4.isNaN());
		System.out.println();

		System.out.println("Double.MAX_EXPONENT : " + Double.MAX_EXPONENT);
		System.out.println("Double.MIN_EXPONENT : " + Double.MIN_EXPONENT);
		System.out.println("Double.MAX_VALUE : " + Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE : " + Double.MIN_VALUE);
		System.out.println("Double.MIN_NORMAL : " + Double.MIN_NORMAL);
		System.out.println("Double.NaN : " + Double.NaN);
		System.out.println("Double.POSITIVE_INFINITY : " + Double.POSITIVE_INFINITY);
		System.out.println("Double.NEGATIVE_INFINITY : " + Double.NEGATIVE_INFINITY);
		System.out.println("Double.SIZE : " + Double.SIZE);
		System.out.println("Double.TYPE : " + Double.TYPE);
		System.out.println();

		System.out.println("new Double(42.5).byteValue() : " + new Double(42.5).byteValue());
		System.out.println();

		System.out.println("Double.compare(10.0, 20.0) : " + Double.compare(10.0, 20.0));
		System.out.println("Double.compare(20.0, 20.0) : " + Double.compare(20.0, 20.0));
		System.out.println("Double.compare(30.0, 20.0) : " + Double.compare(30.0, 20.0));
		System.out.println();

		System.out.println("Double.doubleToLongBits(123.45) : " + Double.doubleToLongBits(123.45));
		System.out.println("Double.doubleToRawLongBits(123.45) : " + Double.doubleToRawLongBits(123.45));
		System.out.println();

		System.out.println("new Double(123.45).doubleValue() : " + new Double(123.45).doubleValue());
		System.out.println();

		System.out.println("new Double(123.45).equals(new Double(123.45)) : " + new Double(123.45).equals(new Double(123.45)));
		System.out.println("new Double(123.45).equals(new Double(23.45)) : " + new Double(123.45).equals(new Double(23.45)));
		System.out.println();

		System.out.println("new Double(1.23456789012345).floatValue() : " + new Double(1.23456789012345).floatValue());
		System.out.println();

		System.out.println("new Double(1.234).hashCode() : " + new Double(1.234).hashCode());
		System.out.println();

		System.out.println("new Double(1.234).intValue() : " + new Double(1.234).intValue());
		System.out.println();

		System.out.println("new Double(123.45).isInfinite() : " + new Double(123.45).isInfinite());
		System.out.println("new Double(Double.NaN).isInfinite() : " + new Double(Double.NaN).isInfinite());
		System.out.println("new Double(Double.POSITIVE_INFINITY).isInfinite() : " + new Double(Double.POSITIVE_INFINITY).isInfinite());
		System.out.println("new Double(Double.NEGATIVE_INFINITY).isInfinite() : " + new Double(Double.NEGATIVE_INFINITY).isInfinite());
		System.out.println();

		System.out.println("new Double(123.45).isNaN() : " + new Double(123.45).isNaN());
		System.out.println("new Double(Double.POSITIVE_INFINITY).isNaN() : " + new Double(Double.POSITIVE_INFINITY).isNaN());
		System.out.println("new Double(Double.NaN).isNaN() : " + new Double(Double.NaN).isNaN());
		System.out.println();

		System.out.println("Double.parseDouble(\"123.45\") : " + Double.parseDouble("123.45"));
		System.out.println();

		System.out.println("new Double(123.45).shortValue() : " + new Double(123.45).shortValue());
		System.out.println();

		System.out.println("Double.toHexString(123.45) : " + Double.toHexString(123.45));
		System.out.println();

		System.out.println("Double.toString(123.45) : " + Double.toString(123.45));
		System.out.println();

		System.out.println("Double.valueOf(1.23456789012) : " + Double.valueOf(1.23456789012));
		System.out.println();

		System.out.println("Double.valueOf(\"1.23456789012\") : " + Double.valueOf("1.23456789012"));
		System.out.println();
	}
}