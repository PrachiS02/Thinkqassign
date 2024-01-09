package com.loop;

import java.util.Scanner;

public class Pattern9 
{
	public static void patterndouble()
	{
		int i, j, k, n;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of rows you want to print: ");  
		n = sc.nextInt();              
		for (i= 0; i<= n-1 ; i++)  
		{  
		for (j=0; j<i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (k=i; k<=n-1; k++)   
		{   
		System.out.print("*" + " ");   
		}   
		System.out.println("");   
		}   
		for (i= n-1; i>= 0; i--)  
		{  
		for (j=0; j<i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (k=i; k<=n-1; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println("");  
		}  
	}
    static void main(String[] args) {
		// TODO Auto-generated method stub
    	patterndouble();
	}

}
