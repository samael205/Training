
package com.rahulmadbhavi.training;

public class Annuity
{
	private double	withdrawalAmount;
	private double	years;
	private double	rateOfReturn;
	private int		numberOfWithdrawals;

	// Constructors
	
	public Annuity(double withdrawalAmount, double years, double rateOfReturn, int numberOfWithdrawals)
	{
		super();
		this.withdrawalAmount = withdrawalAmount;
		this.years = years;
		this.rateOfReturn = rateOfReturn;
		this.numberOfWithdrawals = numberOfWithdrawals;
	}

	// Setters
	
	public void setWithdrawalAmount(double withdrawalAmount)
	{
		this.withdrawalAmount = withdrawalAmount;
	}

	public void setYears(double years)
	{
		this.years = years;
	}

	public void setRateOfReturn(double rateOfReturn)
	{
		this.rateOfReturn = rateOfReturn;
	}

	public void setNumberOfWithdrawals(int numberOfWithdrawals)
	{
		this.numberOfWithdrawals = numberOfWithdrawals;
	}
	
	// Getters

	public double getWithdrawalAmount()
	{
		return withdrawalAmount;
	}

	public double getYears()
	{
		return years;
	}

	public double getRateOfReturn()
	{
		return rateOfReturn;
	}

	public int getNumberOfWithdrawals()
	{
		return numberOfWithdrawals;
	}

	// Method to calculate InitialInvestment
	public double calculateInitialInvestment()
	{
		return ((withdrawalAmount * numberOfWithdrawals / rateOfReturn) * ( 1 - (1/Math.pow((1 + rateOfReturn/numberOfWithdrawals), numberOfWithdrawals * years))));
	}
}
