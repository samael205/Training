package com.rahulmadbhavi.training.utility;

public class HighTemperature
{
	private int hTemp;
	
	public HighTemperature(int hTemp)
	{
		this.hTemp = hTemp;
	}
	
	public boolean sameTemperature(HighTemperature highTemperature)
	{
		return this.hTemp == highTemperature.hTemp;
	}
	
	public boolean lessThanTemperature(HighTemperature highTemperature)
	{
		return this.hTemp < highTemperature.hTemp;
	}
}
