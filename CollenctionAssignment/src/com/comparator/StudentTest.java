package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) 
	{

		ArrayList<Student> ls=new ArrayList<>();
		ls.add(new Student(1,"prachi",30));
		ls.add(new Student(5,"prachi",30));
		ls.add(new Student(3,"sakshi",25));
		ls.add(new Student(4,"raj",27));
		

		Collections.sort(ls, new RollComparator());
		//Collections.sort(ls, new NameComparator());
		Collections.sort(ls, new AgeComparator());
         		

		for (Student st : ls)
		{
              System.out.println(st);
		}
		
		
		
		
		
		
	}

}
