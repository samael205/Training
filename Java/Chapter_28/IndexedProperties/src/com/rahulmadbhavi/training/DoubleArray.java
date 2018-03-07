
package com.rahulmadbhavi.training;

public class DoubleArray
{
	private double data[];

	public double getData(int index)
	{
		return data[index];
	}

	public void setData(int index, double value)
	{
		data[index] = value;
	}

	public double[] getData()
	{
		return data;
	}

	public void setData(double[] data)
	{
		this.data = new double[data.length];
		System.arraycopy(data, 0, data, 0, data.length);
	}
}