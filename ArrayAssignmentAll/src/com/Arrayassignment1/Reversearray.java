//6. WAJP2 print reverse of an array
package com.Arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray 
{
	public static void reverseOrder(int a[])
    {
   	
   	 for(int i=a.length-1;i>=0;i--)
   	 {
   		 System.out.println(a[i]+" ");
   		
   	 }
   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements:");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
       	 a[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(a));
        
        
        reverseOrder(a);
	}

}
