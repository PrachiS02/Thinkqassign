//25. WAJP2 find maximum and minimum element positions in an 
//array
package com.Arrayassignment1;

import java.util.Arrays;

public class Maxminpositionfind 
{
	 public static void checkposition(int a[])
	    {
	    	int index=0;
	    	int i;
	    	int max=a[0];
	    	int min=a[0];
	    	for( i=0;i<a.length;i++)
	    	{
	 
	    		if(a[i]>max)
	    		{
    				max=a[i];
	    			
	    			index++;
	    		}
	    		else if(a[i]<min)
	    		{
	    			min=a[i];
	    			index++;
	    		}
	    		
	    	}
	    	System.out.println(max+" max number at "+(index)+" position");
	    	System.out.println(min+" min number at "+(index)+" position");
	    	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,8,9,1,2};
        System.out.println(Arrays.toString(a));
        checkposition(a);
	}

}
