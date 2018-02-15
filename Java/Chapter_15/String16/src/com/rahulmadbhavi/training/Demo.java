
package com.rahulmadbhavi.training;

class Demo
{
	public static void main(String args[])
	{
		String string;
		int a = 42;

		StringBuffer sb = new StringBuffer(40);

		String s = sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
	}
}