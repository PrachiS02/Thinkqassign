package com.lab;

public class Hellopattern {

	
	public static void pattern(String s)
	{
	  
	   char ch[]=s.toCharArray();
	  
	   for(int i=0;i<ch.length;i++)
	   {
		   System.out.println(s.substring(0,i+1));
	   }
	}
	public static void main(String[] args) 
	{
		
		pattern("hello");
		

	}

}
