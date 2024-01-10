//9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
//32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
//Here both arrays are equal

package com.assignmentonarray;

import java.util.Arrays;

public class Arrayequal
{
    public static boolean equalArray(int a[],int b[])
    {
    	boolean status=true;
    	if(a.length!=b.length)
    	{
    		return false;
    	}
    	else
    		
    	{
    		for(int i=0;i<a.length;i++)
    		{
    			if(a[i]==b[i])
    			{
    				return true;
    			}
    		}
    	}
    	return status;
    	
   	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,6,8,7,9,10};
      int b[]= {10,7,1,2,8,6,9};
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      equalArray(a,b);
      if(equalArray(a,b))
      {
    	  System.out.println("both array are equal");
      }
      else
      {
    	  System.out.println("both array are not equal");
      }
	}

}
