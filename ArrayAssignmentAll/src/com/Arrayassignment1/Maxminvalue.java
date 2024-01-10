//22. WAJP2 find the maximum and minimum value in an array.
package com.Arrayassignment1;

import java.util.Arrays;

public class Maxminvalue
{
   	
    		public static int findMax(int ar[])
    		{
    			//int max= Integer.MIN_VALUE;
    			int max=ar[0];
    			
    			for(int i=0;i<ar.length;i++)
    			{
    				if(ar[i]>max)
    					max=ar[i];
    			}
    			
    			return max;
    		}
    	
    		public static int findMin(int ar[])
    		{
    			//int max= Integer.MIN_VALUE;
    			int min=ar[0];
    			
    			for(int i=0;i<ar.length;i++)
    			{
    				if(ar[i]<min)
    					min=ar[i];
    			}
    			
    			return min;
    		}
    		
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {4,6,7,12,8,9,10};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum element :"+findMax(arr));
		System.out.println("Minimum element :"+findMin(arr));
	}

}
