//33. WAJP2 sort even and odd elements of array separately. 
package com.Arrayassignment1;

import java.util.Arrays;

public class Evenoddseperatesort
{
	public static void evenoddseperate(int a[])
	{
		int i,j;
		int temp;
		int len=a.length;
		
		for( i=0;i<len;i++)
		{
			if(a[i]%2!=0)
				continue;
			else
			{
				for(j=len-1;j>=0&&i<j;j--)
				{
					if(a[j]%2!=0)
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,3,5,6,4,8,7};
        System.out.println(Arrays.toString(a));
        evenoddseperate(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
	}

}
