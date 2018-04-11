package com.rahulmadbhavi.training;

public class NamePhoneEmail
{
	private String name;
	private String phoneNumber;
	private String email;
	
	NamePhoneEmail(String name, String phoneNumber, String email)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getEmail()
	{
		return email;
	}
}
