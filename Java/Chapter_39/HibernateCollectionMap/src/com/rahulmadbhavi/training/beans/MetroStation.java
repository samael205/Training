
package com.rahulmadbhavi.training.beans;

import java.util.Map;

public class MetroStation
{
	// Fields

	private int					id;
	private String				name;
	private Map<String, String>	details;

	// Constructors
	
	public MetroStation()
	{
	}

	public MetroStation(String name, Map<String, String> details)
	{
		this.name = name;
		this.details = details;
	}
	
	// Getters

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public Map<String, String> getDetails()
	{
		return details;
	}

	// Setters
	
	public void setId(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setDetails(Map<String, String> details)
	{
		this.details = details;
	}

	// To String
	
	@Override
	public String toString()
	{
		return "MetroStation [id=" + id + ", name=" + name + ", details=" + details + "]";
	}

}
