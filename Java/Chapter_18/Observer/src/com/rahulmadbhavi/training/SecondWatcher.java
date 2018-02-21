
package com.rahulmadbhavi.training;

import java.util.*;

class SecondWatcher implements Observer
{
	public void update(Observable observable, Object object)
	{
		System.out.println("udpate() of SecondWatcher called, count is " + ((Integer) object).intValue());
	}
}