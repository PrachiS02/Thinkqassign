package com.Arrayassignment1;

import java.util.Arrays;

public class Countfrequency 
{
	public static void calfreq(int a[])
    {
   	  int count;
   	  boolean status;
   	  
   	  for(int i=0;i<a.length;i++)
   	  {
   		  count=1;
   		  status=false;
   		  for(int j=i-1;j>=0;j--)
   		  {
   			  if(a[i]==a[j])
   			  {
   				  status=true;
   				  break;
   			  }
   		  }
   		  if(status==false)
   		  {
   			  for(int k=i+1;k<a.length;k++)
   			  {
   				  if(a[i]==a[k])
   					  count++;
   			  }
   			  //freq 
    			  System.out.println(a[i]+"--> "+count);
   		  }
   	  }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,4,6,2,5,4,2};
         System.out.println(Arrays.toString(a));
         calfreq(a);
	}

}
