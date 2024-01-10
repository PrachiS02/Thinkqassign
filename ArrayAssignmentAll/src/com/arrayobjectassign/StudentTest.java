package com.arrayobjectassign;

public class StudentTest 
{
    public static void calmarks(Student stud[])
    {
    	   
    	   for(Student s:stud)
    	   { 
    		   if((s.getMarks()<60) && (s.getAge()<15))
    		   {
                  System.out.println(s);
    		   }
    	   }
       }
    	   
    
	public static void main(String[] args) 
	{
		Student st[]=new Student[5];
		st[0]=new Student(1,"prachi",14,40);
		st[1]=new Student(2,"pratik",18,80);
		st[2]=new Student(3,"pranali",14,65);
		st[3]=new Student(4,"pranay",12,55);
		st[4]=new Student(5,"Raj",23,90);
		
		for(Student x:st)
		{
			System.out.println(x);
		}
		
       System.out.println("-----------------------------------------------------------");
       calmarks(st);
	}

}
