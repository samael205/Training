
package com.rahulmadbhavi.training;

import java.util.concurrent.Exchanger;

public class Demo
{
	public static void main(String args[])
	{
		Exchanger<String> exchanger = new Exchanger<String>();
		
		new UseString(exchanger);
		new MakeString(exchanger);
	}
}
