//1. WAJP2 
//a. add elements to single dimensional int array 
//b. print elements from single dimensional int array
package com.Arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Singledimarray
{
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
        System.out.println("enter elements:");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        	
        }
        System.out.println(Arrays.toString(arr));
        
        int a[]= {1,2,3,4,5,6};
        System.out.print(Arrays.toString(a));
	}

}
