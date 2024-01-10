//12. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
//54, 34, 10, 0, 34] 
package com.assignmentonarray;

import java.util.Arrays;

public class Replacezero 
{
    public static void replacezero(int a[])
    {
    	 for( int i=0;i<a.length;i++)
    	 {
    		 if(a[i]==0)
    		     a[i]=1;
    	 }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,0,2,0,9,0,0};
		 System.out.println(Arrays.toString(a));
		 replacezero(a);
		 System.out.println("after replacing zero:");
		 System.out.println(Arrays.toString(a));
	}

}
