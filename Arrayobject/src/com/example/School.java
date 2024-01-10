package com.example;

public class School 
{
    static void findTopper(Student stud[])
    {
    	int maxmarks=Integer.MIN_VALUE;
    	Student topper=new Student();
    	
    	for(Student s:stud)
    	{
    		if(s.getMarks()>maxmarks)
    		{
    			topper=s;
    			maxmarks=s.getMarks();
    		}
    	}
    	System.out.println("topper of the students:");
    	System.out.println(topper);
    }
    
    static void sortMarks(Student stud[])
    {
    	Student temp=new Student();
    	for(int i=0;i<stud.length;i++)
    	{
    		for(int j=i+1;j<stud.length;j++)
    		{
    			if(stud[i].getMarks()>stud[j].getMarks())
    			{
    				temp=stud[i];
    				stud[i]=stud[j];
    				stud[j]=temp;
    				
    			}
    		}
    	}
    }
	public static void main(String[] args)
	{
	
     Student st[]=new Student[5];
     System.out.println(st[0]);
     
     for(int i=0;i<st.length;i++)
     {
    	 st[i]=new Student();
     }
     st[0]=new Student(1,"abc",90);
     st[1]=new Student(2,"prachi",87);
     st[2]=new Student(3,"raj",56);
     st[3]=new Student(4,"pratik",20);
     st[4]=new Student(5,"rahul",40);
     
     for(Student s:st)
     {
    	 System.out.println(s);
     }
     System.out.println("-----------------");
     
//     for(int i=0;i<st.length;i++)
//     {
//    	 System.out.println(st[i]);
//     }
     findTopper(st);
     sortMarks(st);
     for(Student s:st)
     {
    	 System.out.println(s);
     }
    
	}

}
