
package com.rahulmadbhavi.training.beans;

import java.util.Map;

public class MetroLine
{
	// Fields
	
	private int					id;
	private String				name;
	private Map<String, MetroStation>	stations;

	// Constructors
	
	public MetroLine()
	{
		super();
	}

	public MetroLine(String name, Map<String, MetroStation> stations)
	{
		super();
	
		this.name = name;
		this.stations = stations;
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

	public Map<String, MetroStation> getStations()
	{
		return stations;
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

	public void setStations(Map<String, MetroStation> stations)
	{
		this.stations = stations;
	}

	// To String.

	@Override
	public String toString()
	{
		return "MetroLine [id=" + id + ", name=" + name + ", stations=" + stations + "]";
	}	

}
