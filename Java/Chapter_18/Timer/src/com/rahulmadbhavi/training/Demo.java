
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();

		myTimer.schedule(myTask, 1000, 500);

		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted.");
		}

		myTimer.cancel();
	}
}