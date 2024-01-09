package com.oops;

public class Student1
{
    private String name;
    private int id;
    private float marks;
   private float per;
   
    Student1()
    {
    	
    }
    
     Student1(String name,int id,float marks)
    {
    	
    	this.name=name;
    	this.id=id;
    	this.marks=marks;    	
    	
    }
    
    public void show()
    {
    
    	float per=(marks/500)*100;
    	System.out.println("percenatage : "+per);	
 
    	if(per>=90)
    		System.out.println("first class");
    	else if(per>=80)
    		System.out.println("second class");
    	else
    		System.out.println("passed....");
 
    }
    
    
	public static void main(String[] args) {
      Student1 s1=new Student1("abc",101,400);
      s1.show();

	}

}
