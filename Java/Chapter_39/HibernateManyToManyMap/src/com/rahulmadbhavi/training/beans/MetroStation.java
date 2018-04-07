
package com.rahulmadbhavi.training.beans;

public class MetroStation
{
	// Fields
	private int		id;
	private String	name;
	private int		platforms;
	private String	type;

	// Constructors
	
	public MetroStation()
	{
		super();
	}

	public MetroStation(String name, int platforms, String type)
	{
		super();
				
		this.name = name;
		this.platforms = platforms;
		this.type = type;
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

	public int getPlatforms()
	{
		return platforms;
	}

	public String getType()
	{
		return type;
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

	public void setPlatforms(int platforms)
	{
		this.platforms = platforms;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	// To String
	
	@Override
	public String toString()
	{
		return "MetroStation [id=" + id + ", name=" + name + ", platforms=" + platforms + ", type=" + type + "]";
	}

}
