
package com.rahulmadbhavi.training;

class MyClass<T extends Comparable<T>> implements MinMax<T>
{
	T[] vals;

	MyClass(T[] vals)
	{
		this.vals = vals;
	}

	public T min()
	{
		if(vals != null)
		{
			T v = vals[0];

			for(int i=1; i<vals.length; i++)
			{
				if(vals[i].compareTo(v) < 0)
				{
					v = vals[i];
				}
			}

			return v;
		}
		else
		{
			return null;
		}
	}

	public T max()
	{
		if(vals != null)
		{
			T v = vals[0];

			for(int i=1; i<vals.length; i++)
			{
				if(vals[i].compareTo(v) > 0)
				{
					v = vals[i];
				}
			}

			return v;
		}
		else
		{
			return null;
		}
	}


}