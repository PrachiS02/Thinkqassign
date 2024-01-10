//3. WAJP2 test if an array contains a specific value
package com.Arrayassignment1;

import java.util.Arrays;

public class Specificvalue
{
	public static boolean findspecificval(int a[],int num1,int num2)
    {
	boolean status=false;
    for(int i=0;i<a.length;i++)
    {
 	   
		if(a[i]==num1 )
		{
			status=true;
		}
		else if(a[i]==num2)
			status=true;
    }
	return status;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,99,99,6};
	       System.out.println(Arrays.toString(a));
	       int n1=1;
	       int n2=2;
	       System.out.println(findspecificval(a,n1,n2));

	}

}
