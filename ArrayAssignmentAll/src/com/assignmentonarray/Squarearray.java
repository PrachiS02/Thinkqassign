//21. WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 
//9, 78, 66, 39, 0] so output is 25, 49, 9. 
package com.assignmentonarray;

import java.util.Arrays;

public class Squarearray
{
    public static void  Squarefind(int a[])
    {
        
    	for(int i=0;i<a.length;i++)
    	{   
    		boolean status=false;
    		int j;
    		for(j=2;j<=(a[i])/2;j++)
    		{
    			int sq=j*j;
    			if(a[i]==sq)
    			{
    				status=true;
    			}
    		}
    	
    		if(status)
    		{
    			System.out.println(a[i]);
    		}
    		
    	  
    	}
        
  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {25,41,16,91,89};
       System.out.println(Arrays.toString(a));
       Squarefind(a);
       
	}

}
