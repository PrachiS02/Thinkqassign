package com.foreachloop;

public class Reversearray 
{
   public static void reverse(int a[])
   {
	   for(int i=a.length-1;i>=0;i--)
	   {
		   System.out.println(a[i]);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3,4,5,6};
       
       for(int x:a)
       {
    	   System.out.println(x);
       }
      System.out.println();
       reverse(a);
	}

}
