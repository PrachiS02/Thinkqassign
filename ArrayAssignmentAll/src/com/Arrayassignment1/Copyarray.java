//5. WAJP2 copy an array by iterating the array.
package com.Arrayassignment1;

import java.util.Arrays;

public class Copyarray 
{
    public static void copyArray(int a[])
    {
    	int size=a.length;
    	int b[]=new int[size];
    	for(int i=0;i<a.length;i++)
    	{
    		b[i]=a[i];
    	}
    	System.out.println("copied array:");
    	System.out.println(Arrays.toString(b));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {1,2,3,4,5};
          System.out.println(Arrays.toString(a));
          copyArray(a);
	}

}
