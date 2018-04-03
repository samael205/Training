package com.rahulmadbhavi.training;

import java.util.Calendar;

public class DateBean
{
	private int day;
	private int month;
	private int year;
	
	public DateBean()
	{
		Calendar calendar = Calendar.getInstance();
		
		day = calendar.get(Calendar.DATE);
		month = calendar.get(Calendar.MONTH) + 1;
		year = calendar.get(Calendar.YEAR);			
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public void setYear(int year)
	{
		this.year = year;
	}		
}
