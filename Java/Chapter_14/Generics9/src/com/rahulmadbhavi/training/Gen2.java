
package com.rahulmadbhavi.training;

class Gen2<T, V> extends Gen<T>
{
	V ob2;

	Gen2(T ob1, V ob2)
	{
		super(ob1);
		this.ob2 = ob2;
	}

	V getOb2()
	{
		return ob2;
	}
}