package com.example2;

public class StudentTest
{
   static double calper(Student s)
   {
	   double per,total=0;
	   double marks[]=s.getMarks();
	   for(double m:marks)
	   {
		   total+=m;
	   }
	   per=(total/500)*100;
	return per;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student st[]=new Student[3];
    
    double m1[]= {46,78,98,91,68};
    st[0]=new Student(1,"prachi",m1);
    
    double m2[]= {45,78,99,91,80};
    st[1]=new Student(2,"ritu",m2);
    
    double m3[]= {12,34,67,89,98};
    st[2]=new Student();
    st[2].setId(3);
    st[2].setName("raj");
    st[2].setMarks(m3);
    
    for(Student s:st)
    {
    	System.out.println(s.getId()+" "+s.getName());
    	System.out.println("percentage:"+calper(s)+"%");
    	
    }
    
    
    
    
	}

}
