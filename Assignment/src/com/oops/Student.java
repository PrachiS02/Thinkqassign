package com.oops;

import java.util.Scanner;

public class Student
{
     //private int id=101;
     //private String name="prachi";
     
     private int id;
     private String name;
	private int customid;
	private String customname;
     
     public Student() {
		// TODO Auto-generated constructor stub
	}

	void displayData()
     {
    	 id=1012;
    	 name="yash";
    	 System.out.println("Id:"+id);
    	 System.out.println("name : "+name);
    	 getId();
    	 
     }
     
     public int getId() 
     {
		return id;
		
	}

	void setId()
     {
    	 this.id=id;
     }
     
	void setCustomData(int customid, String customname)
	{
         this.customid=customid;
         this.customname=customname;
         
         System.out.println("id : "+customid);
         System.out.println("name : "+customname);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		Student s2=new Student();
		
        //System.out.println(s1);
       // System.out.println(s2);
		
		//Student s1=new Student();
		//Student s2=s1;
		
		System.out.println(s1.name);
	     System.out.println(s1.id);
	     
	    // System.out.println(s2.name);
	     //System.out.println(s2.id);
	     
	     //Student a1=new Student();
	     //a1.displayData();
	     Student s3=new Student();
	     s3.setCustomData(102, "abc1");
	     
	     
	     
		
	}

}	


