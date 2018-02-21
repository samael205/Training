
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		BeingWatched observed = new BeingWatched();
		Watcher watcher = new Watcher();
		SecondWatcher secondWatcher = new SecondWatcher();

		observed.addObserver(watcher);
		observed.addObserver(secondWatcher);

		observed.counter(10);
	}
}