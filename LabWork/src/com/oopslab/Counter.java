package com.oopslab;

public class Counter
{
      int a;
      static int b;
       
      Counter(int a,int b)
       {
    	   a++;
    	   b++;
    	   System.out.println(a);
    	   System.out.println(b);
       }
      
	public static void main(String[] args) {
		
		Counter c1=new Counter(10, 10);
		Counter c2=new Counter(10, 11);
		
		
		
		

	}

}
