package com.assignmentonarray;

import java.util.Arrays;

public class Specificvalue 
{
    public static boolean findspecificval(int a[],int num1,int num2)
    {
//        for (int number : a)
//        {
//           
//            boolean status = ((number != num1) && (number != num2));
//           
//            if (status) 
//            {
//                return false;
//            }
//            
//        }
//		return true;
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
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int a[]= {65,89,70,67,77};
       System.out.println(Arrays.toString(a));
       int n1=65;
       int n2=77;
       System.out.println(findspecificval(a,n1,n2));

             
	}

}
