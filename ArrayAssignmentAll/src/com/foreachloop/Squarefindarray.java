package com.foreachloop;

public class Squarefindarray 
{
   public static void findsquare(int a[])
   {
	   for (int i=0;i<a.length;i++)
	   {
		   boolean status=false;
		   for(int j=2;j<=a[i]/2;j++)
		   {
			   int sq=j*j;
			   if(a[i]==sq)
			   {
				   status=true;
			   }
		   }
		   if(status)
		   {
			   System.out.println("square number in array:");
			   System.out.println(a[i]);
		   }
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,3,16,49,67,89};
         
         for(int x:a)
         {
        	 System.out.println(x);
         }
         
         findsquare(a);
	}

}
