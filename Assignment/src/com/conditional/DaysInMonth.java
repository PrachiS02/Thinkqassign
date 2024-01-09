package com.conditional;

import java.util.Scanner;

public class DaysInMonth
{

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter month : ");
		int month=sc.nextInt();
        
		if(month>=1 && month<=12)
		{
			if(month==2)
			{
				System.out.println("total number of days in month : 28");
			}
			else if(month==4 || month==6 || month==9 || month==11)
			{
				System.out.println("total number of days in month : 30");
			}
			else
			{
				System.out.println("total number of days in month : 31");
			}
			
		}
		else
			System.out.println("enter valid month ");
		
	}
	

}
