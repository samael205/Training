
package com.rahulmadbhavi.training;

class GenDemo
{
	public static void main(String args[])
	{
		Gen2<String, Integer> x = new Gen2<String, Integer>("Two", 2);

		System.out.println(x.getOb());
		System.out.println(x.getOb2());
	}
}