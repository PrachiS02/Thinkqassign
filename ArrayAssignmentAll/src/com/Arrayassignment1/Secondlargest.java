//13. WAJP2 find the second largest element in an array
package com.Arrayassignment1;

import java.util.Arrays;

public class Secondlargest 
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
		System.out.println("max number:"+maxnum);
		System.out.println("second max number:"+secondmax);
    	
    }
	public static void main(String[] args) 
	{
		int a[]={67,89,61,90};
        System.out.println(Arrays.toString(a));
        secondmax(a);
	}

}
