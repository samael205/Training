package com.rahulmadbhavi.training;

public class PresentValue
{
	
	// Fields
	
	private double futureValue;
	private double numYears;
	private double rateOfReturn;
	private int compPerYear;
	
	// Constructors
	
	public PresentValue(double futureValue, double numYears, double rateOfReturn, int compPerYear)
	{
		this.futureValue = futureValue;
		this.numYears = numYears;
		this.rateOfReturn = rateOfReturn;
		this.compPerYear = compPerYear;
	}
	
	// Getters

	public double getFutureValue()
	{
		return futureValue;
	}

	public double getNumYears()
	{
		return numYears;
	}

	public double getRateOfReturn()
	{
		return rateOfReturn;
	}

	public int getCompPerYear()
	{
		return compPerYear;
	}

	// Setters
	
	public void setFutureValue(double futureValue)
	{
		this.futureValue = futureValue;
	}

	public void setNumYears(double numYears)
	{
		this.numYears = numYears;
	}

	public void setRateOfReturn(double rateOfReturn)
	{
		this.rateOfReturn = rateOfReturn;
	}

	public void setCompPerYear(int compPerYear)
	{
		this.compPerYear = compPerYear;
	}
	
	// Calculate Present Value
	
	public double computePresentValue()
	{
		return (futureValue / Math.pow((1 + rateOfReturn/compPerYear), compPerYear * numYears));
	}
}
