package com.Arrayassignment1;

public class StudentTest 
{
    public static void eachstudid(Student s[])
    {
    	System.out.println("Each student id :");
    	for(Student st:s)
    	{
    		
    		System.out.println(st.getSid());
    	}
    }
	public static void main(String[] args)
	{
	   Student s[]=new Student[15];
		
		
	    Department d[]=new Department[5];
	    d[0]=new Department(1,"Science");
	 
	   
	    d[1]=new Department(2,"Biotech");
	    d[2]=new Department(3,"Zoo");
	    d[3]=new Department(4,"Botanical");
	    d[4]=new Department(5,"Technical");
	    
	    
	  
	    s[0]=new Student(101,"Raj",d[0]);
	    s[1]=new Student(102,"Reetu",d[1]);
	    s[2]=new Student(103,"Vikram",d[2]);
	    s[3]=new Student(104,"Sachin",d[3]);
	    s[4]=new Student(105,"Sakshi",d[4]);
	    s[5]=new Student(106,"Supriya",d[0]);
	    s[6]=new Student(107,"Bhavna",d[1]);
	    s[7]=new Student(108,"Tirth",d[2]);
	    s[8]=new Student(109,"Pooja",d[3]);
	    s[9]=new Student(110,"Vikas",d[4]);
	    s[10]=new Student(111,"Pranay",d[2]);
	    s[11]=new Student(112,"Pranali",d[1]);
	    s[12]=new Student(113,"Arpita",d[0]);
	    s[13]=new Student(114,"Anuj",d[3]);
	    s[14]=new Student(115,"Radha",d[4]);
	    
	    for(Student x:s)
	    {
	    	System.out.println(x);
	    }
	    
         System.out.println("------------------------------------------------------------------------------");
         
         
         eachstudid(s);
         
         
	}

}
