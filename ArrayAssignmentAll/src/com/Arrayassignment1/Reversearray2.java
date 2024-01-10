//20. Given an array of length 3, return a new array with the elements 
//in reverse order, 
//so {1, 2, 3} becomes {3, 2, 1}. 
//reverse3(*1, 2, 3+) → *3, 2, 1+ 
//reverse3(*5, 11, 9+) → *9, 11, 5+ 
//reverse3(*7, 0, 0+) → *0, 0, 7+
package com.Arrayassignment1;

import java.util.Arrays;

public class Reversearray2 
{
    public static void  reverse(int a[])
    {
    	for(int i=a.length-1;i>=0;i--)
    	{
    		System.out.print(a[i]+" ");
    	}
     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,3};
         System.out.println(Arrays.toString(a));
         reverse(a);
        //System.out.print("reverse order:"+Arrays.toString(a));
         
	}

}
