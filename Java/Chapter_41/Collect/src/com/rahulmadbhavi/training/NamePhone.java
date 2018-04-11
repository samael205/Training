
package com.rahulmadbhavi.training;

public class NamePhone
{
	// Fields
	
	private String	name;
	private String	phoneNumber;

	// Constructors
	
	public NamePhone()
	{
		super();
	}

	public NamePhone(String name, String phoneNumber)
	{
		super();

		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// Getters

	public String getName()
	{
		return name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	// Setters

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

}
