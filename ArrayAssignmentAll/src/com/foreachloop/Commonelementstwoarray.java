package com.
foreachloop;

import java.util.Arrays;

public class Commonelementstwoarray
{
   public static void commonfind(int a1[],int a2[])
   
   {
	   int count=0;
	   
	   for(int i=0;i<a1.length;i++)
	   {
		   count=0;
		   for(int j=0;j<a2.length;j++)
		   {
			   if(a1[i]==a2[j])
			   {
				   count++;
				 
			   }
				   
		   }
		   if(count>0)
		   {
			  
			   System.out.println("common elements :"+a1[i]);
		   }
		  
	   }
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a1[]= {12,23,34,67,78,91};
      int a2[]= {39,25,15,23,55,91,66,24};
      
      
      
      System.out.println("First array elements:");
      for(int x:a1)
      {
    	  System.out.println(x);
      }
      
      System.out.println("Second array elements:");
      for(int y:a2)
      {
    	  System.out.println(y);
      }
      
      commonfind(a1,a2);
      
	}

}
