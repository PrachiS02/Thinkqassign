package com.intermediate;

import java.util.Arrays;

public class Rightrotate 
{
      public static void rotateonce(int a[])
      {
    	  int lastelement=a[a.length-1];
    	  
    	  for(int i=a.length-1;i>0;i--)
    	  {
    		  a[i]=a[i-1];
    	  }
    	  a[0]=lastelement;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5,6,7,8};
     System.out.println(Arrays.toString(a));
     System.out.println("after rotate");
     rotateonce(a);
//     int  n=3;
//     for(int i=0;i<n;i++)
//     {
//    	 rotateonce(a);
//     }
     System.out.println(Arrays.toString(a));
	}

}
