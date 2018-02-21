
package com.rahulmadbhavi.training;

class Student
{
	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	Student()
	{
		this(0, null, 0);
	}

	public String toString()
	{
		return ("Student(" + rollNo + ", " + name + ", " + age + ")");
	}
}