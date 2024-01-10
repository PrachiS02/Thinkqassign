package com.vargs;
//type of arguments
public class Vargsoverloading
{
    public static void display(int ...ar)
    {
    	System.out.println("In int");
    	for(int a:ar)
    	{
    		
    		System.out.println(a);
    	}
    }
    public static void display(double ...ar)
    {
    	System.out.println("In double");
    	for(double a:ar)
    	{
    	
    		System.out.println(a);
    	}
    }
    public static void display(String ...ar)
    {
    	System.out.println("In string");
    	for(String a:ar)
    	{
    		
    		System.out.println(a);
    	}
    }
    public static void display1(int x,char ...ar)
    {
    	System.out.println(x);
		System.out.println("in method1");
    	for(char a:ar)
    	{
    		
    		System.out.println(a);
    	}
    }
    public static void display1(char x,int ...ar)
    {
    	System.out.println(x);
		System.out.println("in method2");
    	for(int a:ar)
    	{
    		
    		System.out.println(a);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           display(1,2,3);
           display(12.1,23.4,23.4);
           display("abx","raj");
           display1('A',1,2,3,4);
           display1(11,'b','c');
//           display1(1,2,3,4,5); ambiguity...no type promotion allowed
           
	}

}
