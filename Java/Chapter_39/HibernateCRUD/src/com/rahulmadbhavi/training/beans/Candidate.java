
package com.rahulmadbhavi.training.beans;

import java.sql.Date;

public class Candidate
{
	// Fields
	private int		rollno;
	private String	name;
	private Date	jdt;
	private String	std;
	private double	fees;

	// Getters
	public int getRollno()
	{
		return rollno;
	}

	public String getName()
	{
		return name;
	}

	public Date getJdt()
	{
		return jdt;
	}

	public String getStd()
	{
		return std;
	}

	public double getFees()
	{
		return fees;
	}

	// Setters
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setJdt(Date jdt)
	{
		this.jdt = jdt;
	}

	public void setStd(String std)
	{
		this.std = std;
	}

	public void setFees(double fees)
	{
		this.fees = fees;
	}
}
