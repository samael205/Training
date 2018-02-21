
package com.rahulmadbhavi.training;

import java.util.*;

class Watcher implements Observer
{
	public void update(Observable observable, Object object)
	{
		System.out.println("udpate() of Watcher called, count is " + ((Integer) object).intValue());
	}
}