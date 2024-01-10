package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("enter elements:");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        	
        }
        System.out.println(Arrays.toString(arr));
	}

}
