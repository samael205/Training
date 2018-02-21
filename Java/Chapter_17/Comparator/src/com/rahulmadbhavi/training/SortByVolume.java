
package com.rahulmadbhavi.training;

import java.util.Comparator;

class SortByVolume implements Comparator<Box>
{
	public int compare(Box box1, Box box2)
	{
		double volume1 = box1.volume();
		double volume2 = box2.volume();

		if(volume1 < volume2)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}