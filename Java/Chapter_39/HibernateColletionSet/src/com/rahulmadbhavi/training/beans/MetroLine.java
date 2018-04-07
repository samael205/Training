
package com.rahulmadbhavi.training.beans;

import java.util.Set;

public class MetroLine
{
	// Fields

	private int			id;
	private String		color;
	private Set<String>	stations;

	// Constructors

	public MetroLine()
	{
	}

	public MetroLine(int id, String color, Set<String> stations)
	{
		this.id = id;
		this.color = color;
		this.stations = stations;
	}

	// Getters

	public int getId()
	{
		return id;
	}

	public String getColor()
	{
		return color;
	}

	public Set<String> getStations()
	{
		return stations;
	}

	// Setters

	public void setId(int id)
	{
		this.id = id;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setStations(Set<String> stations)
	{
		this.stations = stations;
	}
}
