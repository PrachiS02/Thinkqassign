package com.Arrayassignment1;

import java.util.Arrays;

public class Allnegative 
{
     public static void negative(int a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]<0)
    		 {
    			 System.out.print(a[i]+", ");
    		 }
    	 }
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {-1,-2,-3,-8,6,7};
      System.out.println(Arrays.toString(a));
      System.out.println("negative numbers:");
      
      negative(a);
 	
      
	}

}
