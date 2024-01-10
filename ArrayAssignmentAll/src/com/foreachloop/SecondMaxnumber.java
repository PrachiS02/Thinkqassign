package com.foreachloop;

import java.util.Arrays;

public class SecondMaxnumber 
{
    
    	 public static void secondmax(int a[])
    	    {
    	    
    			int maxnum=a[0];
    			int secondmax=a[0];
    			
    			for(int i=0;i<a.length;i++)
    			{
    				if(a[i]>maxnum)
    				{
    					secondmax=maxnum;
    					maxnum=a[i];	
    				}
    				else if(secondmax<a[i]&& a[i]!=maxnum)
    				{
    					secondmax=a[i];
    				}
    			}
    			System.out.println(" max number:"+maxnum);
    			System.out.println("second max number:"+secondmax);
    	
     }
     
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      int a[]= {20,0,31,45,100,1,105,90};
    
    	  //System.out.println(Arrays.toString(a));
    	  
    	  for(int x:a)
    	  {
    		  System.out.println(+x);
    	  }
    	  
    	  secondmax(a);
      } 
     
	
	}


