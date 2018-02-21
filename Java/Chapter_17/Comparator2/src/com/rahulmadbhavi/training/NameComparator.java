
package com.rahulmadbhavi.training;

import java.util.*;

class NameComparator implements Comparator<Student>
{
	public int compare(Student student1, Student student2)
	{
		return student1.name.compareTo(student2.name);
	}
}