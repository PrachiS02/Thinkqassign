//2. WAJP2 find the common elements between two arrays.
package com.Arrayassignment1;

import java.util.Arrays;

public class Commonelemtnsarray
{
	public static void commonelement(int a1[],int a2[])
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
	    				//a2[j]=0;
	    			}
	    		}
	    		if(count>0)
	    		{
	    			System.out.println(a1[i]);
	    		}
	    	}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {12,23,34,67,1,91,65};
		 int a2[]= {39,23,25,1,3,19,65};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        commonelement(a1,a2);
	}

}
