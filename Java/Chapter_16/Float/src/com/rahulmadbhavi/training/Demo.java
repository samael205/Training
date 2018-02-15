
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("Float.MAX_EXPONENT : " + Float.MAX_EXPONENT);
		System.out.println("Float.MIN_EXPONENT : " + Float.MIN_EXPONENT);
		System.out.println("Float.MAX_VALUE : " + Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE : " + Float.MIN_VALUE);
		System.out.println("Float.MIN_NORMAL : " + Float.MIN_NORMAL);
		System.out.println("Float.NaN : " + Float.NaN);
		System.out.println("Float.POSITIVE_INFINITY : " + Float.POSITIVE_INFINITY);
		System.out.println("Float.NEGATIVE_INFINITY : " + Float.NEGATIVE_INFINITY);
		System.out.println("Float.SIZE : " + Float.SIZE);
		System.out.println("Float.TYPE : " + Float.TYPE);
		System.out.println();

		System.out.println("new Float(123.45F).byteValue() : " + new Float(123.45F).byteValue());
		System.out.println();

		System.out.println("Float.compare(10.0F, 20.0F) : " + Float.compare(10.0F, 20.0F));
		System.out.println("Float.compare(20.0F, 20.0F) : " + Float.compare(20.0F, 20.0F));
		System.out.println("Float.compare(30.0F, 20.0F) : " + Float.compare(30.0F, 20.0F));
		System.out.println();

		System.out.println("new Float(10.0F).compareTo(new Float(20.0F)) : " + new Float(10.0F).compareTo(new Float(20.0F)));
		System.out.println("new Float(20.0F).compareTo(new Float(20.0F)) : " + new Float(20.0F).compareTo(new Float(20.0F)));
		System.out.println("new Float(30.0F).compareTo(new Float(20.0F)) : " + new Float(30.0F).compareTo(new Float(20.0F)));
		System.out.println();

		System.out.println("Float.floatToIntBits(123.45F) : " + Float.floatToIntBits(123.45F));
		System.out.println("Float.floatToRawIntBits(123.45F) : " + Float.floatToRawIntBits(123.45F));
		System.out.println();

		System.out.println("new Float(123.45F).floatValue() : " + new Float(123.45F).floatValue());
		System.out.println();

		System.out.println("new Float(123.45F).hashCode() : " + new Float(123.45F).hashCode());
		System.out.println();

		System.out.println("new Float(123.45F).intValue() : " + new Float(123.45F).intValue());
		System.out.println("new Float(123.45F).longValue() : " + new Float(123.45F).longValue());
		System.out.println("new Float(123.45F).shortValue() : " + new Float(123.45F).shortValue());
		System.out.println();

		System.out.println("new Float(123.45F).isInfinite() : " + new Float(123.45F).isInfinite());
		System.out.println("new Float(Float.NaN).isInfinite() : " + new Float(Float.NaN).isInfinite());
		System.out.println("new Float(Float.POSITIVE_INFINITY).isInfinite() : " + new Float(Float.POSITIVE_INFINITY).isInfinite());
		System.out.println();

		System.out.println("Float.isInfinite(123.45F) : " + Float.isInfinite(123.45F));
		System.out.println("Float.isInfinite(Float.NaN) : " + Float.isInfinite(Float.NaN));
		System.out.println("Float.isInfinite(Float.POSITIVE_INFINITY) : " + Float.isInfinite(Float.POSITIVE_INFINITY));
		System.out.println();

		System.out.println("new Float(123.45F).isNaN() : " + new Float(123.45F).isNaN());
		System.out.println("new Float(Float.NaN).isNaN() : " + new Float(Float.NaN).isNaN());
		System.out.println("new Float(Float.POSITIVE_INFINITY).isNaN() : " + new Float(Float.POSITIVE_INFINITY).isNaN());
		System.out.println();

		System.out.println("Float.isNaN(123.45F) : " + Float.isNaN(123.45F));
		System.out.println("Float.isNaN(Float.POSITIVE_INFINITY) : " + Float.isNaN(Float.POSITIVE_INFINITY));
		System.out.println("Float.isNaN(Float.NaN) : " + Float.isNaN(Float.NaN));
		System.out.println();

		System.out.println("Float.parseFloat(\"123.45F\") : " + Float.parseFloat("123.45F"));
		System.out.println();

		System.out.println("new Float(123.45F).toString() : " + new Float(123.45F).toString());
		System.out.println("Float.toString(123.45F) : " + Float.toString(123.45F));
		System.out.println();

		System.out.println("Float.valueOf(123.45F) : " + Float.valueOf(123.45F));
		System.out.println("Float.valueOf(\"123.45F\") : " + Float.valueOf("123.45F"));
		System.out.println();
	}
}