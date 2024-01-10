package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args)
	{
      ArrayList<Student> slist=new ArrayList<>();
      slist.add(new Student(101,"Reetu",90.0));
      slist.add(new Student(102,"Prachi",89.0));
      slist.add(new Student(103,"Riya",66.0));
      slist.add(new Student(104,"Pranay",73.0));
      slist.add(new Student(105,"Pranali",82.0));
      
      for(Student st:slist)
      {
    	  System.out.println(st);
      }
      
      Collections.sort(slist,new Markscomparator());
      
      
      System.out.println("------------------");
      for(Student s:slist)
      {
    	  System.out.println(s);
      }
	}

}
