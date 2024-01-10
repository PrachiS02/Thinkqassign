//18. WAJP2 count total number of even and odd elements in an array
package com.Arrayassignment1;

import java.util.Arrays;

public class Evenoddcountnumber 
{
	public static void evenoddcount(int a[])
	{
		int evencnt=0;
		int oddcnt=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				
				evencnt++;
			}
			else
			{
				oddcnt++;
			}
		}
		
	
		int even[]=new int[evencnt];
		int odd[]=new int[oddcnt];
		
		int x=0,y=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			even[x]=a[i];
			x++;
			}
			else
			{
				odd[y]=a[i];
				y++;
			}
		}
		
		System.out.println("array of even numbers:");
		
			for(int i=0;i<x;i++)
			{
				System.out.print(even[i]+" ");
				
				
			}
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("count of even number in array:"+evencnt);
			System.out.println("");
		   
		   System.out.println("array of odd numbers:");
		   
			for(int i=0;i<y;i++)
			{
				System.out.print(odd[i]+" ");
					
			}
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("count of odd number in array:"+oddcnt);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        evenoddcount(a);
        
        
	}

}
