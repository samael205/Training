package com.rahulmadbhavi.training.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name", length=25)
	String name;
	
	@Column(name="fees")
	double fees;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getFees()
	{
		return fees;
	}
	
	public void setFees(double fees)
	{
		this.fees = fees;
	}
}
