package com.comparable;

import java.util.Comparator;

public class Markscomparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2)
	{
		if(s1.getMarks()==s2.getMarks())
			return 0;
		else if(s1.getMarks()<s2.getMarks())
			return -1;
		else
			return 1;
		
	}

}
