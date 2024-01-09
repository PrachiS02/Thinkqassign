package com.stringarrayexception;

public class ReflectionDemo
{
     private String s;
     
     public ReflectionDemo() 
     {
    	 s="Reflection Example";
     }
     
     public void method1()
     {
    	 System.out.println("The string is "+s);
     }
     
     public void method2(int n)
     {
    	 System.out.println("The number is "+n);
     }
     
     private String method3()
     {
    	 System.out.println("Private method invoked");
    	 return s;
     }
	public static void main(String[] args) {
		ReflectionDemo rd=new ReflectionDemo();
	

	}

}
