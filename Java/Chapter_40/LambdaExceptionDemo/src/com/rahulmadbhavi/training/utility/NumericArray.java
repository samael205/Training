package com.rahulmadbhavi.training.utility;

import com.rahulmadbhavi.training.exceptions.ArrayEmptyException;
import com.rahulmadbhavi.training.exceptions.ArrayNullException;

public interface NumericArray<T extends Number>
{
	double average(T[] t) throws ArrayNullException, ArrayEmptyException;
}
