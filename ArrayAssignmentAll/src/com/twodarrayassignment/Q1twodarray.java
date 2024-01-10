package com.twodarrayassignment;

import java.util.Scanner;

public class Q1twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element:");
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<4;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        
        for(int i=0;i<3;i++)
        {
        	for(int s:a[i])
        	{
        		System.out.print(s+" ");
        	}
        	System.out.println();
        }
        
	}

}
