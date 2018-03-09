
package com.rahulmadbhavi.training;

public class FutureValue
{
	// Fields
	
	private double	principal;
	private double	rateOfInterest;
	private double	numYears;
	private int		compPerYear;

	// Constructors
	public FutureValue(double principal, double rateOfInterest, double numYears, int compPerYear)
	{
		this.principal = principal;
		this.rateOfInterest = rateOfInterest;
		this.numYears = numYears;
		this.compPerYear = compPerYear;
	}
	
	// Setters
	
	public void setPrincipal(double principal)
	{
		this.principal = principal;
	}

	public void setRateOfInterest(double rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}

	public void setNumYears(double numYears)
	{
		this.numYears = numYears;
	}

	public void setCompPerYear(int compPerYear)
	{
		this.compPerYear = compPerYear;
	}

	// Getters
	
	public double getPrincipal()
	{
		return principal;
	}

	public double getRateOfInterest()
	{
		return rateOfInterest;
	}

	public double getNumYears()
	{
		return numYears;
	}

	public int getCompPerYear()
	{
		return compPerYear;
	}

	// Method to calculate Future value of an investment.
	
	public double computeFutureValue()
	{
		return (principal * Math.pow((1 + rateOfInterest/ compPerYear), (compPerYear * numYears)));
	}
}
