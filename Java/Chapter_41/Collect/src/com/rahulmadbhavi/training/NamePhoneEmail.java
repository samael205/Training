
package com.rahulmadbhavi.training;

public class NamePhoneEmail
{
	// Fields
	
	private String	name;
	private String	phoneNumber;
	private String	email;

	// Constructors
	
	public NamePhoneEmail()
	{
		super();
	}

	public NamePhoneEmail(String name, String phoneNumber, String email)
	{
		super();
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
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

	public String getEmail()
	{
		return email;
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

	public void setEmail(String email)
	{
		this.email = email;
	}

}
