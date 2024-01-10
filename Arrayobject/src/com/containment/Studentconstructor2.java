package com.containment;

public class Studentconstructor2 
{
    
	static void countstudpercourse(Student[] st,Course[]cour)
	{
		int count;
		for(Course c:cour)
		{
			count=0;
			for(Student s:st)
			{
				if(s.getCourse().equals(c));
				{
					count++;
				}
			}
			System.out.println(c+"->"+count);
		}
	}
	
	static void infocountemppercourse(Student[] st,Course[]cour)
	{
	       for(Course c:cour)
	       {
	    	   System.out.println(c);
	    	   for(Student s:st)
	    	   {
	    		   if(s.getCourse().equals(c))
	    		   {
	    			   System.out.println(s.getId()+" "+s.getName());
	    		   }
	    	   }
	       }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Course c[]=new Course[3];
         c[0]=new Course(1,"java",89000);
         c[1]=new Course(2,"adavjava",49000);
         c[2]=new Course(3,"python",49000);
         
         
         Student st[]=new Student[5];
         st[0]=new Student(101,"prachi",c[0]);
         st[1]=new Student(102,"rahi",c[1]);
         st[2]=new Student(103,"rahul",c[2]);
         st[3]=new Student(104,"radhika",c[1]);
         
         st[4]=new Student();
         st[4].setId(105);
         st[4].setName("anup");
         st[4].setCourse(c[2]);
         
         for(Student s:st)
         {
        	 System.out.println(s);
         }
        	
         System.out.println("-------------------");
         countstudpercourse(st,c);
         
//         infocountstudpercourse(st,c);
         
	}

}
