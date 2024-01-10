package com.example2;

import java.util.Scanner;

public class Studentuserinput
{
	static Scanner sc=new Scanner(System.in);
    static  void enterdetails(Student s)
    {
    	System.out.println("enter id:");
    	s.setId(sc.nextInt());
    	
    	System.out.println("enter name:");
    	s.setName(sc.next());
    	
    	System.out.println("enter the marks of 5 subjects:");
    	double m[]=new double[5];
    	
    	for(int i=0;i<m.length;i++)
    	{
    		m[i]=sc.nextDouble();
    	}
    	
    	s.setMarks(m);
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Student st[]=new Student[3];
        for(int i =0;i<st.length;i++)
        {
        	st[i]=new Student();
        	enterdetails(st[i]);
        }
        System.out.println("--------------------");
        
        for(Student s:st)
        {
        	System.out.println(s.getId()+" "+s.getName());
        	System.out.println("percentage:"+StudentTest.calper(s)+"%");
        }
	}

}
