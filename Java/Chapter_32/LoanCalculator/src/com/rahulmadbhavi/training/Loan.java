
package com.rahulmadbhavi.training;

class Loan
{
	// Fields

	private double principal;
	private double interestRate;
	private double duration;
	private int paymentsPerYear;

	// Constructors

	Loan(double principal, double interestRate, double duration, int paymentsPerYear)
	{
		this.principal 			= principal;
		this.interestRate 		= interestRate;
		this.duration 			= duration;
		this.paymentsPerYear 	= paymentsPerYear;
	}

	Loan(double principal, double interestRate, double duration)
	{
		this(principal, interestRate, duration, 12);
	}

	// Setters

	public void setPrincipal(double principal)
	{
		this.principal = principal;
	}

	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}

	public void setDuration(double duration)
	{
		this.duration = duration;
	}

	public void setPaymentsPerYear(int paymentsPerYear)
	{
		this.paymentsPerYear = paymentsPerYear;
	}

	// Getters

	public double getPrincipal()
	{
		return principal;
	}	

	public double getInterestRate()
	{
		return interestRate;
	}

	public double getDuration()
	{
		return duration;
	}

	public int getPaymentsPerYear()
	{
		return paymentsPerYear;
	}

	// Compute Installment

	public double computeInstallment()
	{
		return ((interestRate * principal / paymentsPerYear) / (1 - Math.pow((interestRate / paymentsPerYear) + 1, - paymentsPerYear * duration)));
	}
}