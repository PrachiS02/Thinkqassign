//2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]
package com.assignmentonarray;

import java.util.Arrays;

public class SecondMinvalue
{
	 public static void secondmin(int a[])
	    {
	    
	    
			int minnum=a[0];
			int secondmin=a[0];
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<minnum)
				{
					secondmin=minnum;
					minnum=a[i];	
				}
				else if(secondmin>a[i]&& a[i]!=minnum)
				{
					secondmin=a[i];
				}
			}
			System.out.println(" min number:"+minnum);
			System.out.println("second min number:"+secondmin);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[]= {89,88,99};
		  
	        System.out.println(Arrays.toString(a));
	        secondmin(a);
	}

}
