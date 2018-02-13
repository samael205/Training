
package com.rahulmadbhavi.training;

class Stats<T extends Number>
{
	T[] nums;

	Stats(T[] nums)
	{
		this.nums = nums;
	}

	double average()
	{
		double sum = 0.0;
		
		for(T x : nums)
		{
			sum += x.doubleValue();
		}	

		return sum/nums.length;
	}
}