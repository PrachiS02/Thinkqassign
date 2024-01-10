package com.comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2)
	{
		if(s1.getName()==s2.getName())
			return 0;
		return 1;
		
			
	}
	
}


