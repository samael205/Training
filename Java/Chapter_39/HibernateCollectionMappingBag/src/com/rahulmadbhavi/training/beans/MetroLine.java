
package com.rahulmadbhavi.training.beans;

import java.util.List;

public class MetroLine
{
	// Fields

	private int				id;
	private String			color;
	private List<String>	stations;

	// Constructors

	public MetroLine()
	{
	}

	public MetroLine(int id, String color, List<String> stations)
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

	public List<String> getStations()
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

	public void setStations(List<String> stations)
	{
		this.stations = stations;
	}
}
