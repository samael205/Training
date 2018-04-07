
package com.rahulmadbhavi.training.beans;

import java.util.List;

public class MetroLine
{
	// Fields

	private int					id;
	private String				color;
	private List<MetroStation>	stations;

	// Constructors
	
	public MetroLine()
	{
	}

	public MetroLine(int id, String color, List<MetroStation> stations)
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

	public List<MetroStation> getStations()
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

	public void setStations(List<MetroStation> stations)
	{
		this.stations = stations;
	}

	// To String
	
	@Override
	public String toString()
	{
		return "MetroLine [id=" + id + ", color=" + color + ", stations=" + stations + "]";
	}

}
