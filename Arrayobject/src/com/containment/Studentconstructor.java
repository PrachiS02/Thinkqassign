package com.containment;

public class Studentconstructor 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Course c1=new Course(1,"java",89000);
         Course c2=new Course(2,"mysql",49000);
         
         Student st[]=new Student[3];
         st[0]=new Student(101,"prachi",c1);
         st[1]=new Student(102,"rahi",c2);
         
         st[2]=new Student();
         st[2].setId(103);
         st[2].setName("anup");
         st[2].setCourse(c2);
         
         for(Student s:st)
         {
        	 System.out.println(s);
         }
        		 
         
	}

}
