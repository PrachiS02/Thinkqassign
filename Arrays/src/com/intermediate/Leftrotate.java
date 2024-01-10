package com.intermediate;

import java.util.Arrays;

public class Leftrotate
{
    public static void rotateleft(int a[])
    {
  	  int firstelement=a[0];
  	  
  	  for(int i=0;i<a.length-1;i++)
  	  {
  		  a[i]=a[i+1];
  	  }
  	  a[a.length-1]=firstelement;
    }
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
	     System.out.println(Arrays.toString(a));
	     System.out.println("after rotate");
	     rotateleft(a);
//	     int  n=2;
//	     for(int i=0;i<n;i++)
//	     {
//	    	 rotateleft(a);
//	     }
	     System.out.println(Arrays.toString(a));
	}

}
