package com.shiftingelement;

import java.util.Arrays;

public class Zeroatend
{
      public static void shiftzero(int a[])
      {
    	  int pos=0;
    	  for(int i=0;i<a.length;i++)
    	  {
    		  
    		  if(a[i]!=0)
    		  {
    			  a[pos]=a[i];
    			  pos++;
    		  }
    	  }
    	  while(pos<a.length)
    	  {
    		  a[pos]=0;
    		  pos++;
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,0,9,0,5,0,6};
        System.out.println(Arrays.toString(a));
        shiftzero(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
	}

}
