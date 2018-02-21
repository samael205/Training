
package com.rahulmadbhavi.training;

import java.util.*;

class BeingWatched extends Observable
{
	void counter(int period)
	{
		for(; period>=0; period--)
		{
			setChanged();
			notifyObservers(new Integer(period));

			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Sleep interrupted.");
			}
		}
	}
}