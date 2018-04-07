
package com.rahulmadbhavi.training.beans;

public class MetroStation
{
	private int		id;
	private String	name;
	private boolean	underground;
	private int		platforms;

	// Constructors

	public MetroStation()
	{
	}

	public MetroStation(String name, boolean underground, int platforms)
	{
		this.name = name;
		this.underground = underground;
		this.platforms = platforms;
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

	public boolean getUnderground()
	{
		return underground;
	}

	public int getPlatforms()
	{
		return platforms;
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

	public void setUnderground(boolean underground)
	{
		this.underground = underground;
	}

	public void setPlatforms(int platforms)
	{
		this.platforms = platforms;
	}

	// To String
	
	@Override
	public String toString()
	{
		return "MetroStation [id=" + id + ", name=" + name + ", underground=" + underground + ", platforms=" + platforms + "]";
	}

}
