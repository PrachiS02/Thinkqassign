package com.constructor;

public class ConstrDemo
{
   String name;
   
   public ConstrDemo()
   {
	   name="unknown";
   }
   
   ConstrDemo(String name)
   {
	   
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
	public static void main(String[] args) 
	{
		ConstrDemo c1=new ConstrDemo();
		
		System.out.println(c1.getName());
		
        ConstrDemo c2=new ConstrDemo("prachi");
		
		System.out.println(c2.getName());
        
	}

}
