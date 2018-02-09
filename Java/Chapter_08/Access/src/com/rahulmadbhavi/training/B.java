
package com.rahulmadbhavi.training;

class B extends A
{
	int total;

	void sum()
	{
		// Error
		//total = i + j;

		total = i + getj();
	}
}