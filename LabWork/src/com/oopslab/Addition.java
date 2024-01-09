package com.oopslab;

public class Addition 
{
     void add(int a,int b)
     {
    	 System.out.println("a+b:"+(a+b));
     }
     void add(int a,float b)
     {
    	 System.out.println("a+b:"+(a+b));
     }
     void add(int a,float b,double c)
     {
    	 System.out.println("a+b+c:"+(a+b+c));
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Addition a1=new Addition();
         a1.add(10, 20);
         a1.add(50, 2.0f);
         a1.add(20, 1.0f, 50);
	}

}
